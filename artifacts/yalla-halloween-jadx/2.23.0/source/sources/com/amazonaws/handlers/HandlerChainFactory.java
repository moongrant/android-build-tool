package com.amazonaws.handlers;

import com.amazonaws.AmazonClientException;
import com.amazonaws.util.StringUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class HandlerChainFactory {
    public final ArrayList OooO00o(Class cls, String str) throws Throwable {
        BufferedReader bufferedReader;
        Class<?> cls2;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                InputStream resourceAsStream = getClass().getResourceAsStream(str);
                if (resourceAsStream == null) {
                    return arrayList;
                }
                bufferedReader = new BufferedReader(new InputStreamReader(resourceAsStream, StringUtils.f9590OooO00o));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException unused) {
                            }
                            return arrayList;
                        }
                        String strTrim = line.trim();
                        if (!"".equals(strTrim)) {
                            int i = 2;
                            int i2 = 0;
                            Class[] clsArr = {cls, getClass()};
                            while (true) {
                                if (i2 >= i) {
                                    cls2 = null;
                                    break;
                                }
                                ClassLoader classLoader = clsArr[i2].getClassLoader();
                                if (classLoader != null) {
                                    try {
                                        cls2 = classLoader.loadClass(strTrim);
                                        break;
                                    } catch (ClassNotFoundException unused2) {
                                        continue;
                                        i2++;
                                    }
                                }
                                i2++;
                            }
                            if (cls2 == null) {
                                ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
                                if (contextClassLoader == null) {
                                    cls2 = null;
                                } else {
                                    try {
                                        cls2 = contextClassLoader.loadClass(strTrim);
                                    } catch (ClassNotFoundException unused3) {
                                        cls2 = null;
                                    }
                                }
                            }
                            if (cls2 == null) {
                                cls2 = Class.forName(strTrim);
                            }
                            Object objNewInstance = cls2.newInstance();
                            if (!cls.isInstance(objNewInstance)) {
                                throw new AmazonClientException("Unable to instantiate request handler chain for client.  Listed request handler ('" + strTrim + "') does not implement the " + cls + " API.");
                            }
                            if (cls == RequestHandler2.class) {
                                arrayList.add((RequestHandler2) objNewInstance);
                            } else {
                                if (cls != RequestHandler.class) {
                                    throw new IllegalStateException();
                                }
                                arrayList.add(new RequestHandler2Adaptor((RequestHandler) objNewInstance));
                            }
                        }
                    } catch (Exception e) {
                        e = e;
                    } catch (Throwable th) {
                        th = th;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException unused4) {
                            }
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
            }
        } catch (Exception e2) {
            e = e2;
        }
        throw new AmazonClientException("Unable to instantiate request handler chain for client: " + e.getMessage(), e);
    }
}
