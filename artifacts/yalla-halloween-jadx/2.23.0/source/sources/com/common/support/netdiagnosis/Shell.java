package com.common.support.netdiagnosis;

import com.qiniu.android.collect.ReportItem;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J%\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r¨\u0006\u0011"}, d2 = {"Lcom/common/support/netdiagnosis/Shell;", "", "()V", "closeIO", "", "closeable", "Ljava/io/Closeable;", "execCmd", "Lcom/common/support/netdiagnosis/Shell$CommandResult;", "commands", "", "", "isRoot", "", "([Ljava/lang/String;Z)Lcom/common/support/netdiagnosis/Shell$CommandResult;", "command", "CommandResult", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Shell {

    @NotNull
    public static final Shell INSTANCE = new Shell();

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/common/support/netdiagnosis/Shell$CommandResult;", "", ReportItem.QualityKeyResult, "", "successMsg", "", "errorMsg", "(ILjava/lang/String;Ljava/lang/String;)V", "getErrorMsg", "()Ljava/lang/String;", "setErrorMsg", "(Ljava/lang/String;)V", "getResult", "()I", "setResult", "(I)V", "getSuccessMsg", "setSuccessMsg", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class CommandResult {

        @Nullable
        private String errorMsg;
        private int result;

        @Nullable
        private String successMsg;

        public CommandResult(int i, @Nullable String str, @Nullable String str2) {
            this.result = i;
            this.successMsg = str;
            this.errorMsg = str2;
        }

        @Nullable
        public final String getErrorMsg() {
            return this.errorMsg;
        }

        public final int getResult() {
            return this.result;
        }

        @Nullable
        public final String getSuccessMsg() {
            return this.successMsg;
        }

        public final void setErrorMsg(@Nullable String str) {
            this.errorMsg = str;
        }

        public final void setResult(int i) {
            this.result = i;
        }

        public final void setSuccessMsg(@Nullable String str) {
            this.successMsg = str;
        }
    }

    private Shell() {
    }

    private final void closeIO(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static /* synthetic */ CommandResult execCmd$default(Shell shell, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return shell.execCmd(str, z);
    }

    @NotNull
    public final CommandResult execCmd(@NotNull String command, boolean isRoot) {
        Intrinsics.checkNotNullParameter(command, "command");
        return execCmd(new String[]{command}, isRoot);
    }

    public static /* synthetic */ CommandResult execCmd$default(Shell shell, String[] strArr, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return shell.execCmd(strArr, z);
    }

    /* JADX WARN: Code duplicated, block: B:74:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:78:0x0103  */
    /* JADX WARN: Code duplicated, block: B:79:0x0105  */
    /* JADX WARN: Code duplicated, block: B:82:0x010c  */
    /* JADX WARN: Code duplicated, block: B:91:0x0123  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.common.support.netdiagnosis.Shell] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.io.BufferedReader, java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.io.BufferedReader, java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @NotNull
    public final CommandResult execCmd(@Nullable String[] commands, boolean isRoot) throws Throwable {
        Process processExec;
        Object obj;
        StringBuilder sb;
        Process process;
        DataOutputStream dataOutputStream;
        ?? r6;
        DataOutputStream dataOutputStream2;
        ?? bufferedReader;
        ?? r5;
        ?? bufferedReader2;
        Object obj2;
        StringBuilder sb2;
        ?? r4;
        String string;
        StringBuilder sb3;
        boolean z = true;
        if (commands != null) {
            if (!(commands.length == 0)) {
                z = false;
            }
        }
        DataOutputStream dataOutputStream3 = null;
        int iWaitFor = -1;
        if (z) {
            return new CommandResult(-1, null, null);
        }
        try {
            processExec = Runtime.getRuntime().exec(isRoot ? "su" : "sh");
            try {
                dataOutputStream = new DataOutputStream(processExec.getOutputStream());
                try {
                    try {
                        Iterator it = ArrayIteratorKt.iterator(commands);
                        while (it.hasNext()) {
                            String str = (String) it.next();
                            Charset charset = Charsets.UTF_8;
                            if (str == null) {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                            }
                            byte[] bytes = str.getBytes(charset);
                            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                            dataOutputStream.write(bytes);
                            dataOutputStream.writeBytes("\n");
                            dataOutputStream.flush();
                        }
                        dataOutputStream.writeBytes("exit\n");
                        dataOutputStream.flush();
                        sb2 = new StringBuilder();
                        try {
                            sb3 = new StringBuilder();
                            try {
                                bufferedReader2 = new BufferedReader(new InputStreamReader(processExec.getInputStream(), "UTF-8"));
                                try {
                                    bufferedReader = new BufferedReader(new InputStreamReader(processExec.getErrorStream(), "UTF-8"));
                                    while (true) {
                                        try {
                                            String line = bufferedReader2.readLine();
                                            if (line == null) {
                                                break;
                                            }
                                            sb2.append(line);
                                        } catch (Exception e) {
                                            e = e;
                                            sb = sb2;
                                            e = e;
                                            process = processExec;
                                            obj2 = sb3;
                                            bufferedReader2 = bufferedReader2;
                                            bufferedReader = bufferedReader;
                                            try {
                                                e.printStackTrace();
                                                closeIO(dataOutputStream);
                                                closeIO(bufferedReader2);
                                                closeIO(bufferedReader);
                                                if (process != null) {
                                                    process.destroy();
                                                }
                                                sb2 = sb;
                                                r4 = obj2;
                                            } catch (Throwable th) {
                                                th = th;
                                                processExec = process;
                                                dataOutputStream3 = dataOutputStream;
                                                r5 = bufferedReader2;
                                                r6 = bufferedReader;
                                                closeIO(dataOutputStream3);
                                                closeIO(r5);
                                                closeIO(r6);
                                                if (processExec != null) {
                                                    processExec.destroy();
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            dataOutputStream3 = dataOutputStream;
                                            r5 = bufferedReader2;
                                            r6 = bufferedReader;
                                            closeIO(dataOutputStream3);
                                            closeIO(r5);
                                            closeIO(r6);
                                            if (processExec != null) {
                                                processExec.destroy();
                                            }
                                            throw th;
                                        }
                                    }
                                    while (true) {
                                        String line2 = bufferedReader.readLine();
                                        if (line2 == null) {
                                            break;
                                        }
                                        sb3.append(line2);
                                    }
                                    iWaitFor = processExec.waitFor();
                                    closeIO(dataOutputStream);
                                    closeIO(bufferedReader2);
                                    closeIO(bufferedReader);
                                    processExec.destroy();
                                    r4 = sb3;
                                } catch (Exception e2) {
                                    e = e2;
                                    bufferedReader = 0;
                                } catch (Throwable th3) {
                                    th = th3;
                                    bufferedReader = 0;
                                }
                            } catch (Exception e3) {
                                e = e3;
                                bufferedReader2 = 0;
                                sb3 = sb3;
                                bufferedReader = bufferedReader2;
                                sb = sb2;
                                e = e;
                                process = processExec;
                                obj2 = sb3;
                                bufferedReader2 = bufferedReader2;
                                bufferedReader = bufferedReader;
                                e.printStackTrace();
                                closeIO(dataOutputStream);
                                closeIO(bufferedReader2);
                                closeIO(bufferedReader);
                                if (process != null) {
                                    process.destroy();
                                }
                                sb2 = sb;
                                r4 = obj2;
                                if (sb2 == null) {
                                    string = null;
                                } else {
                                    string = sb2.toString();
                                }
                                return new CommandResult(iWaitFor, string, r4 != 0 ? r4.toString() : null);
                            }
                        } catch (Exception e4) {
                            e = e4;
                            sb3 = null;
                            bufferedReader2 = 0;
                        }
                    } catch (Exception e5) {
                        e = e5;
                        process = processExec;
                        sb = null;
                        dataOutputStream2 = null;
                        DataOutputStream dataOutputStream4 = dataOutputStream2;
                        bufferedReader = dataOutputStream4;
                        obj2 = dataOutputStream2;
                        bufferedReader2 = dataOutputStream4;
                        e.printStackTrace();
                        closeIO(dataOutputStream);
                        closeIO(bufferedReader2);
                        closeIO(bufferedReader);
                        if (process != null) {
                            process.destroy();
                        }
                        sb2 = sb;
                        r4 = obj2;
                        if (sb2 == null) {
                            string = null;
                        } else {
                            string = sb2.toString();
                        }
                        return new CommandResult(iWaitFor, string, r4 != 0 ? r4.toString() : null);
                    }
                } catch (Throwable th4) {
                    th = th4;
                    bufferedReader2 = 0;
                    bufferedReader = 0;
                }
            } catch (Exception e6) {
                e = e6;
                process = processExec;
                sb = null;
                dataOutputStream = null;
                dataOutputStream2 = dataOutputStream;
                DataOutputStream dataOutputStream5 = dataOutputStream2;
                bufferedReader = dataOutputStream5;
                obj2 = dataOutputStream2;
                bufferedReader2 = dataOutputStream5;
                e.printStackTrace();
                closeIO(dataOutputStream);
                closeIO(bufferedReader2);
                closeIO(bufferedReader);
                if (process != null) {
                    process.destroy();
                }
                sb2 = sb;
                r4 = obj2;
                if (sb2 == null) {
                    string = null;
                } else {
                    string = sb2.toString();
                }
                return new CommandResult(iWaitFor, string, r4 != 0 ? r4.toString() : null);
            } catch (Throwable th5) {
                th = th5;
                obj = null;
                r6 = obj;
                r5 = obj;
                closeIO(dataOutputStream3);
                closeIO(r5);
                closeIO(r6);
                if (processExec != null) {
                    processExec.destroy();
                }
                throw th;
            }
        } catch (Exception e7) {
            e = e7;
            sb = null;
            process = null;
            dataOutputStream = null;
        } catch (Throwable th6) {
            th = th6;
            processExec = null;
            obj = null;
        }
        if (sb2 == null) {
            string = null;
        } else {
            string = sb2.toString();
        }
        return new CommandResult(iWaitFor, string, r4 != 0 ? r4.toString() : null);
    }
}
