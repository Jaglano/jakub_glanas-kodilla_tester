package com.kodilla.mockito.homework;

import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;

class AlertsTest {
    private Notify notifyMock;
    private Alerts weatherAlerts;

    @BeforeAll
    public static void startTests(){
        System.out.println("Starting testing");
    }

    @AfterEach
    public void breakTime(){
        System.out.println("\n---------");
    }

    @BeforeEach
    void settingTests(){
        notifyMock = mock(Notify.class);
        weatherAlerts = new Alerts(notifyMock);

        Location warsaw = new Location("Warsaw");
        Location krakow = new Location("Krakow");
        Location berlin = new Location("Berlin");
        Location paris = new Location("Paris");
        Location pekin = new Location("Pekin");

        User ken = new User("Ken");
        User bob = new User("Bob");
        User hugo = new User("Hugo");
        User karolina = new User("Karolina");
        User klaudia = new User("Klaudia");

        weatherAlerts.addLocation(warsaw);
        weatherAlerts.addLocation(krakow);
        weatherAlerts.addLocation(berlin);
        weatherAlerts.addLocation(paris);
        weatherAlerts.addLocation(pekin);

        weatherAlerts.addSubscriber(bob, warsaw);
        weatherAlerts.addSubscriber(bob, krakow);
        weatherAlerts.addSubscriber(hugo, berlin);
        weatherAlerts.addSubscriber(karolina, paris);
        weatherAlerts.addSubscriber(klaudia, pekin);
    }

    @Test
    void shouldAddSubscriberToLocation(){
        User diego = new User("Diego");
        Location newYork = new Location("New York");
        weatherAlerts.addLocation(newYork);
        weatherAlerts.addSubscriber(diego, newYork);

        Assertions.assertEquals(1, weatherAlerts.getLocations()
                .values()
                .stream()
                .flatMap(a->a.stream())
                .filter(b->b.equals(diego))
                .count());
        Assertions.assertEquals(1, weatherAlerts.getLocations()
                .keySet()
                .stream()
                .filter(b->b.equals(newYork))
                .count());
    }

    @Test
    void shouldRemoveLocation(){
        Location miami = new Location("Miami");
        weatherAlerts.addLocation(miami);
        weatherAlerts.removeLocation(miami);
        Assertions.assertEquals(0,weatherAlerts.getLocations()
                .keySet().stream()
                .filter(location -> location.equals(miami))
                .count());
    }

    @Test
    void shouldRemoveUserFromAllLocations(){
        weatherAlerts.removeSubscriberFromAllLocations(new User("Deleted guy"));
        Assertions.assertTrue(weatherAlerts.getLocations()
                .values()
                .stream()
                .flatMap(a->a.stream())
                .filter(x->x.equals(new User("Deleted guy")))
                .findAny()
                .isEmpty());
    }

    @Test
    void shouldRemoveUserFromLocation(){
        weatherAlerts.removeSubscriber(new User("Bob"), new Location("Warsaw"));
        Assertions.assertEquals(1, weatherAlerts.getLocations()
                .values()
                .stream()
                .flatMap(x -> x.stream())
                .filter(p -> p.equals(new User("Bob")))
                .count());
    }

    @Test
    void shouldSendAlertToAllUsers(){
        weatherAlerts.sendNotifyToAll("Alert RCB...");
        verify(notifyMock, times(4)).alert(any(),any());
    }

    @Test
    void shouldSendAlertToAllLocations(){
        weatherAlerts.sendNotifyToLocation(new Location("Berlin"),"Alert RCB...");
        verify(notifyMock,times(1)).alert(new User("Hugo"),"Alert RCB...");
        verify(notifyMock,times(0)).alert(new User("Bob"),"Alert RCB...");
    }

}