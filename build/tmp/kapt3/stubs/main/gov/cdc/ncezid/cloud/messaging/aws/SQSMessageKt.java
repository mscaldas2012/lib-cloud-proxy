package gov.cdc.ncezid.cloud.messaging.aws;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0002"}, d2 = {"SQS_KEY_PATH", "", "lib-cloud-proxy"})
public final class SQSMessageKt {
    private static final java.lang.String SQS_KEY_PATH = "$[\'Records\'][0][\'s3\'][\'object\'][\'key\']";
}