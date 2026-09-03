package o0O000;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o {
    /* JADX WARN: Code duplicated, block: B:59:0x0093 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0089 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Nullable
    public static final String OooO00o(@NotNull String command) throws Throwable {
        BufferedInputStream bufferedInputStream;
        Process process;
        Process processExec;
        BufferedOutputStream bufferedOutputStream;
        BufferedInputStream bufferedInputStream2;
        Intrinsics.checkNotNullParameter(command, "command");
        BufferedOutputStream bufferedOutputStream2 = null;
        BufferedInputStream bufferedInputStream3 = null;
        bufferedOutputStream2 = null;
        str = null;
        String str = null;
        try {
            processExec = Runtime.getRuntime().exec("sh");
            try {
                bufferedOutputStream = new BufferedOutputStream(processExec.getOutputStream());
                try {
                    bufferedInputStream2 = new BufferedInputStream(processExec.getInputStream());
                    try {
                        byte[] bytes = command.getBytes(Charsets.UTF_8);
                        Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                        bufferedOutputStream.write(bytes);
                        bufferedOutputStream.write(10);
                        bufferedOutputStream.flush();
                        bufferedOutputStream.close();
                        processExec.waitFor();
                        String strOooO0O0 = OooO0O0(bufferedInputStream2);
                        try {
                            bufferedOutputStream.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        try {
                            bufferedInputStream2.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                        str = strOooO0O0;
                    } catch (Exception unused) {
                        if (bufferedOutputStream != null) {
                            try {
                                bufferedOutputStream.close();
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                        }
                        if (bufferedInputStream2 != null) {
                            try {
                                bufferedInputStream2.close();
                            } catch (IOException e4) {
                                e4.printStackTrace();
                            }
                        }
                        if (processExec != null) {
                        }
                        return str;
                    } catch (Throwable th) {
                        th = th;
                        bufferedInputStream3 = bufferedInputStream2;
                        bufferedInputStream = bufferedInputStream3;
                        bufferedOutputStream2 = bufferedOutputStream;
                        process = processExec;
                        if (bufferedOutputStream2 != null) {
                            try {
                                bufferedOutputStream2.close();
                            } catch (IOException e5) {
                                e5.printStackTrace();
                            }
                        }
                        if (bufferedInputStream != null) {
                            try {
                                bufferedInputStream.close();
                            } catch (IOException e6) {
                                e6.printStackTrace();
                            }
                        }
                        if (process == null) {
                            throw th;
                        }
                        process.destroy();
                        throw th;
                    }
                } catch (Exception unused2) {
                    bufferedInputStream2 = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception unused3) {
                bufferedOutputStream = null;
                bufferedInputStream2 = null;
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }
                if (bufferedInputStream2 != null) {
                    bufferedInputStream2.close();
                }
                if (processExec != null) {
                    processExec.destroy();
                }
                return str;
            } catch (Throwable th3) {
                th = th3;
                process = processExec;
                bufferedInputStream = null;
            }
        } catch (Exception unused4) {
            processExec = null;
        } catch (Throwable th4) {
            th = th4;
            bufferedInputStream = null;
            process = null;
        }
        processExec.destroy();
        return str;
    }

    public static final String OooO0O0(BufferedInputStream bufferedInputStream) {
        int i;
        byte[] bArr = new byte[512];
        StringBuilder sb = new StringBuilder();
        do {
            try {
                i = bufferedInputStream.read(bArr);
                if (i > 0) {
                    sb.append(new String(bArr, 0, i, Charsets.UTF_8));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (i >= 512);
        return sb.toString();
    }
}
