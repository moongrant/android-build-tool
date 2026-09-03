package com.amazonaws.handlers;

import com.amazonaws.AmazonClientException;
import com.amazonaws.util.ClassLoaderHelper;
import com.amazonaws.util.StringUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class HandlerChainFactory {
    public final List<RequestHandler2> OooO00o(String str, Class<?> cls) throws Throwable {
        BufferedReader bufferedReader;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                InputStream resourceAsStream = getClass().getResourceAsStream(str);
                if (resourceAsStream == null) {
                    return arrayList;
                }
                bufferedReader = new BufferedReader(new InputStreamReader(resourceAsStream, StringUtils.f11186OooO00o));
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
                            Class<?> clsOooO00o = ClassLoaderHelper.OooO00o(strTrim, new Class[]{cls, getClass()});
                            if (clsOooO00o == null) {
                                ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
                                if (contextClassLoader == null) {
                                    clsOooO00o = null;
                                } else {
                                    try {
                                        clsOooO00o = contextClassLoader.loadClass(strTrim);
                                    } catch (ClassNotFoundException unused2) {
                                        clsOooO00o = null;
                                    }
                                }
                            }
                            if (clsOooO00o == null) {
                                clsOooO00o = Class.forName(strTrim);
                            }
                            Object objNewInstance = clsOooO00o.newInstance();
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
                            } catch (IOException unused3) {
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

    public final List<RequestHandler2> OooO0O0(String str) {
        return OooO00o(str, RequestHandler2.class);
    }

    public final List<RequestHandler2> OooO0OO(String str) {
        return OooO00o(str, RequestHandler.class);
    }
}
