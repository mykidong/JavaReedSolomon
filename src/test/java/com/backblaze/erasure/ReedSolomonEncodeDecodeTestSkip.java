package com.backblaze.erasure;

import org.junit.Test;

import java.util.Arrays;

public class ReedSolomonEncodeDecodeTestSkip {

    private String filefName = "build/resources/test/data/Kafka_The_Definitive_Guide.pdf";

    @Test
    public void encode() throws Exception
    {
        SampleEncoder.main(Arrays.asList(filefName).toArray(new String[0]));
    }

    @Test
    public void decode() throws Exception
    {
        SampleDecoder.main(Arrays.asList(filefName).toArray(new String[0]));
    }
}
