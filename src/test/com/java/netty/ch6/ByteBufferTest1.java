package com.java.netty.ch6;

import org.junit.Test;

import java.nio.ByteBuffer;

public class ByteBufferTest1 {
    @Test
    public void test() {
        ByteBuffer firstBuffer = ByteBuffer.allocate(11);
        System.out.println("바이트 버퍼 초기값 : " + firstBuffer);

        byte[] source = "Hello world".getBytes();
        firstBuffer.put(source);
        System.out.println("11바이트 기록 후 : " + firstBuffer);
    }
}
