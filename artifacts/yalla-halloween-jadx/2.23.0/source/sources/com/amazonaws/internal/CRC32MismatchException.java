package com.amazonaws.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class CRC32MismatchException extends IOException {
    public CRC32MismatchException() {
        super("Client calculated crc32 checksum didn't match that calculated by server side");
    }
}
