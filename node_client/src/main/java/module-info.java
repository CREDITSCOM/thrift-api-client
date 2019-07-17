module node.client {
    requires libthrift;
    requires jsr250.api;
    requires com.credits.general;
    requires commons.codec;
    requires eddsa;
    requires slf4j.api;
    requires org.apache.commons.lang3;
    requires com.credits.sc.api;
    exports com.credits.client.node.exception;
    exports com.credits.client.node.pojo;
    exports com.credits.client.node.service;
    exports com.credits.client.node.thrift.generated;
    exports com.credits.client.node.util;
    exports com.credits.client.node.crypto;
}