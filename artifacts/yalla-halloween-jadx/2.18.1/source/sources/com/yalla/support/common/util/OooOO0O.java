package com.yalla.support.common.util;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0O {
    /* JADX WARN: Code duplicated, block: B:50:0x00e1 A[PHI: r3 r4
      0x00e1: PHI (r3v4 int) = (r3v2 int), (r3v6 int) binds: [B:49:0x00df, B:23:0x00a9] A[DONT_GENERATE, DONT_INLINE]
      0x00e1: PHI (r4v8 java.lang.Process) = (r4v7 java.lang.Process), (r4v10 java.lang.Process) binds: [B:49:0x00df, B:23:0x00a9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x00e6 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:59:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    public static final boolean OooO00o(@NotNull String hostOrIp) throws Throwable {
        Process processExec;
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2;
        DataOutputStream dataOutputStream;
        BufferedReader bufferedReader3;
        Intrinsics.checkNotNullParameter(hostOrIp, "hostOrIp");
        Intrinsics.checkNotNullParameter(hostOrIp, "hostOrIp");
        if (hostOrIp.length() == 0) {
            hostOrIp = "223.5.5.5";
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String command = String.format("ping -c 1 %s", Arrays.copyOf(new Object[]{hostOrIp}, 1));
        Intrinsics.checkNotNullExpressionValue(command, "format(format, *args)");
        Intrinsics.checkNotNullParameter(command, "command");
        String[] strArr = {command};
        DataOutputStream dataOutputStream2 = null;
        BufferedReader bufferedReader4 = null;
        BufferedReader bufferedReader5 = null;
        int iWaitFor = -1;
        try {
            processExec = Runtime.getRuntime().exec("sh");
            try {
                dataOutputStream = new DataOutputStream(processExec.getOutputStream());
                try {
                    Iterator it = ArrayIteratorKt.iterator(strArr);
                    while (it.hasNext()) {
                        byte[] bytes = ((String) it.next()).getBytes(Charsets.UTF_8);
                        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                        dataOutputStream.write(bytes);
                        dataOutputStream.writeBytes("\n");
                        dataOutputStream.flush();
                    }
                    dataOutputStream.writeBytes("exit\n");
                    dataOutputStream.flush();
                    iWaitFor = processExec.waitFor();
                    bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream(), "UTF-8"));
                    try {
                        bufferedReader2 = new BufferedReader(new InputStreamReader(processExec.getErrorStream(), "UTF-8"));
                        do {
                            try {
                            } catch (Exception e) {
                                e = e;
                                bufferedReader4 = bufferedReader2;
                                BufferedReader bufferedReader6 = bufferedReader4;
                                bufferedReader5 = bufferedReader;
                                bufferedReader3 = bufferedReader6;
                                try {
                                    e.printStackTrace();
                                    OooOOOO.OooO0Oo(dataOutputStream);
                                    OooOOOO.OooO0Oo(bufferedReader5);
                                    OooOOOO.OooO0Oo(bufferedReader3);
                                    if (processExec != null) {
                                    }
                                    if (iWaitFor == 0) {
                                        return true;
                                    }
                                    return false;
                                } catch (Throwable th) {
                                    th = th;
                                    bufferedReader2 = bufferedReader3;
                                    bufferedReader = bufferedReader5;
                                    dataOutputStream2 = dataOutputStream;
                                    OooOOOO.OooO0Oo(dataOutputStream2);
                                    OooOOOO.OooO0Oo(bufferedReader);
                                    OooOOOO.OooO0Oo(bufferedReader2);
                                    if (processExec != null) {
                                        processExec.destroy();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                dataOutputStream2 = dataOutputStream;
                                OooOOOO.OooO0Oo(dataOutputStream2);
                                OooOOOO.OooO0Oo(bufferedReader);
                                OooOOOO.OooO0Oo(bufferedReader2);
                                if (processExec != null) {
                                    processExec.destroy();
                                }
                                throw th;
                            }
                        } while (bufferedReader.readLine() != null);
                        do {
                        } while (bufferedReader2.readLine() != null);
                        OooOOOO.OooO0Oo(dataOutputStream);
                        OooOOOO.OooO0Oo(bufferedReader);
                        OooOOOO.OooO0Oo(bufferedReader2);
                    } catch (Exception e2) {
                        e = e2;
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedReader2 = null;
                    }
                } catch (Exception e3) {
                    e = e3;
                    bufferedReader3 = null;
                    e.printStackTrace();
                    OooOOOO.OooO0Oo(dataOutputStream);
                    OooOOOO.OooO0Oo(bufferedReader5);
                    OooOOOO.OooO0Oo(bufferedReader3);
                    if (processExec != null) {
                        processExec.destroy();
                    }
                    if (iWaitFor == 0) {
                        return true;
                    }
                    return false;
                } catch (Throwable th4) {
                    th = th4;
                    bufferedReader = null;
                    bufferedReader2 = null;
                }
            } catch (Exception e4) {
                e = e4;
                dataOutputStream = null;
                bufferedReader3 = null;
                e.printStackTrace();
                OooOOOO.OooO0Oo(dataOutputStream);
                OooOOOO.OooO0Oo(bufferedReader5);
                OooOOOO.OooO0Oo(bufferedReader3);
                if (processExec != null) {
                    processExec.destroy();
                }
                if (iWaitFor == 0) {
                    return true;
                }
                return false;
            } catch (Throwable th5) {
                th = th5;
                bufferedReader = null;
                bufferedReader2 = null;
                OooOOOO.OooO0Oo(dataOutputStream2);
                OooOOOO.OooO0Oo(bufferedReader);
                OooOOOO.OooO0Oo(bufferedReader2);
                if (processExec != null) {
                    processExec.destroy();
                }
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            processExec = null;
        } catch (Throwable th6) {
            th = th6;
            processExec = null;
        }
        processExec.destroy();
        if (iWaitFor == 0) {
            return true;
        }
        return false;
    }
}
