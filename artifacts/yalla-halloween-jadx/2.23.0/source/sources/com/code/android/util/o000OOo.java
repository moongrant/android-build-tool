package com.code.android.util;

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
public final class o000OOo {
    /* JADX WARN: Code duplicated, block: B:50:0x00e4 A[PHI: r4 r5
      0x00e4: PHI (r4v4 int) = (r4v2 int), (r4v6 int) binds: [B:49:0x00e2, B:23:0x00a9] A[DONT_GENERATE, DONT_INLINE]
      0x00e4: PHI (r5v8 java.lang.Process) = (r5v7 java.lang.Process), (r5v10 java.lang.Process) binds: [B:49:0x00e2, B:23:0x00a9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean OooO00o(@NotNull String hostOrIp) throws Throwable {
        Process processExec;
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2;
        Exception e;
        DataOutputStream dataOutputStream;
        BufferedReader bufferedReader3;
        BufferedReader bufferedReader4;
        Throwable th;
        Intrinsics.checkNotNullParameter(hostOrIp, "hostOrIp");
        Intrinsics.checkNotNullParameter(hostOrIp, "hostOrIp");
        if ((hostOrIp.length() == 0) != false) {
            hostOrIp = "223.5.5.5";
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String command = String.format("ping -c 1 %s", Arrays.copyOf(new Object[]{hostOrIp}, 1));
        Intrinsics.checkNotNullExpressionValue(command, "format(format, *args)");
        Intrinsics.checkNotNullParameter(command, "command");
        String[] strArr = {command};
        DataOutputStream dataOutputStream2 = null;
        BufferedReader bufferedReader5 = null;
        BufferedReader bufferedReader6 = null;
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
                    bufferedReader4 = new BufferedReader(new InputStreamReader(processExec.getInputStream(), "UTF-8"));
                    try {
                        bufferedReader2 = new BufferedReader(new InputStreamReader(processExec.getErrorStream(), "UTF-8"));
                        do {
                            try {
                            } catch (Exception e2) {
                                e = e2;
                                bufferedReader5 = bufferedReader2;
                                BufferedReader bufferedReader7 = bufferedReader5;
                                bufferedReader6 = bufferedReader4;
                                bufferedReader3 = bufferedReader7;
                                try {
                                    e.printStackTrace();
                                    o0000oo.OooO00o(dataOutputStream);
                                    o0000oo.OooO00o(bufferedReader6);
                                    o0000oo.OooO00o(bufferedReader3);
                                    if (processExec != null) {
                                    }
                                    if (iWaitFor == 0) {
                                        return true;
                                    }
                                    return false;
                                } catch (Throwable th2) {
                                    th = th2;
                                    bufferedReader2 = bufferedReader3;
                                    bufferedReader4 = bufferedReader6;
                                    dataOutputStream2 = dataOutputStream;
                                    Throwable th3 = th;
                                    bufferedReader = bufferedReader4;
                                    th = th3;
                                    o0000oo.OooO00o(dataOutputStream2);
                                    o0000oo.OooO00o(bufferedReader);
                                    o0000oo.OooO00o(bufferedReader2);
                                    if (processExec == null) {
                                        throw th;
                                    }
                                    processExec.destroy();
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                dataOutputStream2 = dataOutputStream;
                                Throwable th5 = th;
                                bufferedReader = bufferedReader4;
                                th = th5;
                                o0000oo.OooO00o(dataOutputStream2);
                                o0000oo.OooO00o(bufferedReader);
                                o0000oo.OooO00o(bufferedReader2);
                                if (processExec == null) {
                                    throw th;
                                }
                                processExec.destroy();
                                throw th;
                            }
                        } while (bufferedReader4.readLine() != null);
                        do {
                        } while (bufferedReader2.readLine() != null);
                        o0000oo.OooO00o(dataOutputStream);
                        o0000oo.OooO00o(bufferedReader4);
                        o0000oo.OooO00o(bufferedReader2);
                    } catch (Exception e3) {
                        e = e3;
                    } catch (Throwable th6) {
                        th = th6;
                        bufferedReader2 = null;
                    }
                } catch (Exception e4) {
                    e = e4;
                    bufferedReader3 = null;
                    e.printStackTrace();
                    o0000oo.OooO00o(dataOutputStream);
                    o0000oo.OooO00o(bufferedReader6);
                    o0000oo.OooO00o(bufferedReader3);
                    if (processExec != null) {
                        processExec.destroy();
                    }
                    if (iWaitFor == 0) {
                        return true;
                    }
                    return false;
                } catch (Throwable th7) {
                    th = th7;
                    bufferedReader4 = null;
                    bufferedReader2 = null;
                }
            } catch (Exception e5) {
                e = e5;
                e = e;
                dataOutputStream = null;
                bufferedReader3 = null;
                e.printStackTrace();
                o0000oo.OooO00o(dataOutputStream);
                o0000oo.OooO00o(bufferedReader6);
                o0000oo.OooO00o(bufferedReader3);
                if (processExec != null) {
                    processExec.destroy();
                }
                if (iWaitFor == 0) {
                    return true;
                }
                return false;
            } catch (Throwable th8) {
                th = th8;
                bufferedReader = null;
                bufferedReader2 = null;
                o0000oo.OooO00o(dataOutputStream2);
                o0000oo.OooO00o(bufferedReader);
                o0000oo.OooO00o(bufferedReader2);
                if (processExec == null) {
                    throw th;
                }
                processExec.destroy();
                throw th;
            }
        } catch (Exception e6) {
            e = e6;
            processExec = null;
        } catch (Throwable th9) {
            th = th9;
            processExec = null;
        }
        processExec.destroy();
        if (iWaitFor == 0) {
            return true;
        }
        return false;
    }
}
