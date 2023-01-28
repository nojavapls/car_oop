package Mechanic;

import Transport.Transport;

    public class Mechanic<T extends Transport >  {
        private String mechanicName;
        private String companyName;

        public Mechanic(String mechanicName, String companyName){
            if (mechanicName == null || mechanicName.length() == 0) {
                this.mechanicName = "Joe Doe";
            } else {
                this.mechanicName = mechanicName;
            }
            if (companyName == null || companyName.length() == 0) {
                this.companyName = "default";
            } else {
                this.companyName = companyName;
            }
        }
        public String getMechanicName() {
            return mechanicName;
        }

        public String getCompanyName() {
            return companyName;
        }

        public void setCompanyName(String companyName) {
            this.companyName = companyName;
        }

        public void setMechanicName(String mechanicName) {
            this.mechanicName = mechanicName;
        }

        public void maintenance(Transport transport)
        {
            System.out.println("Механик "+getMechanicName() +" из компании " + getCompanyName() + " проводит техобслуживание " + transport.getBrand()+ " " + transport.getModel() +"!");
        }

        public void fixing(Transport transport)
        {
            System.out.println("Механик "+getMechanicName() +" из компании " + getCompanyName() + " чинит автомобиль " + transport.getModel());
        }

        @Override
        public String toString() {
            return mechanicName;
        }
    }
