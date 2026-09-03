package com.geetest.captcha;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class l {
    public static final char a = File.separatorChar;
    public static String b;

    static {
        try {
            StringWriter stringWriter = new StringWriter(4);
            new PrintWriter(stringWriter).println();
            b = stringWriter.toString();
        } catch (Exception unused) {
        }
    }

    private static String a(InputStream inputStream, Charset charset) throws IOException {
        try {
            StringWriter stringWriter = new StringWriter();
            a(new InputStreamReader(inputStream, charset), stringWriter);
            return stringWriter.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    private static long b(Reader reader, Writer writer) throws IOException {
        return a(reader, writer, new char[4096]);
    }

    public static String a(InputStream inputStream, String str) throws IOException {
        return a(inputStream, Charset.forName(str));
    }

    public static String a(Reader reader) {
        try {
            StringWriter stringWriter = new StringWriter();
            a(reader, stringWriter);
            return stringWriter.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String a(byte[] bArr, String str) throws IOException {
        return new String(bArr, Charset.forName(str));
    }

    public static void a(String str, Writer writer) throws IOException {
        if (str != null) {
            writer.write(str);
        }
    }

    private static int a(Reader reader, Writer writer) throws IOException {
        long jB = b(reader, writer);
        if (jB > 2147483647L) {
            return -1;
        }
        return (int) jB;
    }

    private static long a(Reader reader, Writer writer, char[] cArr) throws IOException {
        long j = 0;
        while (true) {
            int i = reader.read(cArr);
            if (-1 == i) {
                return j;
            }
            writer.write(cArr, 0, i);
            j += (long) i;
        }
    }
}
