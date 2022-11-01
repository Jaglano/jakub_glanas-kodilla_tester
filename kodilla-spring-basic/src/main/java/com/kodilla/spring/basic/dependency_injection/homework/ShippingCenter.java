package com.kodilla.spring.basic.dependency_injection.homework;

public class ShippingCenter {

    private DeliveryServiceInter deliveryService;
    private NotificationServiceInter notificationService;

    public ShippingCenter(DeliveryServiceInter deliveryService, NotificationServiceInter notificationService) {
        this.deliveryService = deliveryService;
        this.notificationService = notificationService;
    }

    public void sendPackage(String address, double weight){
        if (deliveryService.deliverPackage(address, weight)){
            notificationService.success(address);
        } else {
            notificationService.fail(address);
        }
    }
}
