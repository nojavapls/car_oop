package Exceptions;

import Transport.Transport;

    public class DiagnosticsNotPassed extends Exception {

        private final Transport transport;
        public DiagnosticsNotPassed(String message, Transport transport) {
            super(message);
            this.transport = transport;
        }
        public Transport getTransport() {
            return transport;
        }
    }
