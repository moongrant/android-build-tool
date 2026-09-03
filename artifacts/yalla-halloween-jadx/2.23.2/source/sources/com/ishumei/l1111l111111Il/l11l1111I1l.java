package com.ishumei.l1111l111111Il;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Environment;
import android.text.TextUtils;
import com.ishumei.dfp.SMSDK;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p028Oooo0oO.o0oOO;
import p039OoooOoo.o0o0Oo;

/* JADX INFO: loaded from: classes3.dex */
public class l11l1111I1l {
    private static String l1111l111111Il = "sm";
    private static l11l1111I1l l111l1111lIl;
    private l111l1111lI1l l111l11111I1l;
    private l111l1111lI1l l111l11111Il;
    private l111l1111lI1l l111l11111lIl;
    private l111l1111lI1l l111l1111l1Il;
    private l111l1111lI1l l111l1111lI1l;
    private l111l1111lI1l l111l1111llIl;

    public static abstract class l1111l111111Il extends l111l11111lIl {
        private l1111l111111Il() {
            super((byte) 0);
        }

        private static String l111l11111Il() {
            return Environment.getExternalStorageDirectory().getAbsolutePath();
        }

        public abstract List<String> l1111l111111Il();

        @Override // com.ishumei.l1111l111111Il.l11l1111I1l.l111l11111lIl
        public final void l1111l111111Il(String str) throws Throwable {
            List<String> listL1111l111111Il;
            try {
                if (com.ishumei.l111l1111llIl.l111l1111lIl.l111l1111lI1l("android.permission.WRITE_EXTERNAL_STORAGE") && (listL1111l111111Il = l1111l111111Il()) != null && listL1111l111111Il.size() != 0) {
                    String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
                    Iterator<String> it = listL1111l111111Il.iterator();
                    while (it.hasNext()) {
                        File file = new File(absolutePath + File.separator + it.next());
                        try {
                            if (!file.exists()) {
                                file.getParentFile().mkdirs();
                                File file2 = new File(file.getPath() + ".tmp");
                                if (com.ishumei.l111l1111llIl.l111l1111lI1l.l1111l111111Il(str)) {
                                    throw new IOException("file or bytes empty");
                                }
                                FileWriter fileWriter = null;
                                try {
                                    FileWriter fileWriter2 = new FileWriter(file2);
                                    try {
                                        fileWriter2.write(str);
                                        fileWriter2.close();
                                        file2.renameTo(file);
                                    } catch (Throwable th) {
                                        th = th;
                                        fileWriter = fileWriter2;
                                        if (fileWriter != null) {
                                            fileWriter.close();
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            } catch (Exception unused2) {
            }
        }

        @Override // com.ishumei.l1111l111111Il.l11l1111I1l.l111l11111lIl
        public String l111l11111lIl() {
            String str = "";
            try {
                if (!com.ishumei.l111l1111llIl.l111l1111lIl.l111l1111lI1l("android.permission.READ_EXTERNAL_STORAGE")) {
                    return "";
                }
                List<String> listL1111l111111Il = l1111l111111Il();
                if (listL1111l111111Il != null && listL1111l111111Il.size() != 0) {
                    String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
                    Iterator<String> it = listL1111l111111Il.iterator();
                    while (it.hasNext()) {
                        File file = new File(absolutePath + File.separator + it.next());
                        try {
                            if (file.exists()) {
                                return com.ishumei.l111l1111llIl.l111l1111lIl.l1111l111111Il(file);
                            }
                        } catch (Exception unused) {
                        }
                    }
                    return str;
                }
                return null;
            } catch (Exception unused2) {
                return str;
            }
        }

        public /* synthetic */ l1111l111111Il(byte b) {
            this();
        }
    }

    public static abstract class l111l11111I1l extends l111l11111lIl {
        private l111l11111I1l() {
            super((byte) 0);
        }

        private static SharedPreferences l111l11111I1l(String str) {
            Context context = com.ishumei.l1111l111111Il.l111l1111llIl.l1111l111111Il.l111l11111Il;
            if (context == null) {
                return null;
            }
            return context.getSharedPreferences(str, 0);
        }

        public abstract String l1111l111111Il();

        @Override // com.ishumei.l1111l111111Il.l11l1111I1l.l111l11111lIl
        public final void l1111l111111Il(String str) {
            SharedPreferences sharedPreferencesL111l11111I1l;
            try {
                String strL1111l111111Il = l1111l111111Il();
                String strL111l11111Il = l111l11111Il();
                if (TextUtils.isEmpty(strL1111l111111Il) || TextUtils.isEmpty(strL111l11111Il) || (sharedPreferencesL111l11111I1l = l111l11111I1l(strL1111l111111Il)) == null) {
                    return;
                }
                SharedPreferences.Editor editorEdit = sharedPreferencesL111l11111I1l.edit();
                editorEdit.putString(strL111l11111Il, str);
                editorEdit.apply();
            } catch (Exception unused) {
            }
        }

        public abstract String l111l11111Il();

        @Override // com.ishumei.l1111l111111Il.l11l1111I1l.l111l11111lIl
        public String l111l11111lIl() {
            SharedPreferences sharedPreferencesL111l11111I1l;
            try {
                String strL1111l111111Il = l1111l111111Il();
                String strL111l11111Il = l111l11111Il();
                if (TextUtils.isEmpty(strL1111l111111Il) || TextUtils.isEmpty(strL111l11111Il) || (sharedPreferencesL111l11111I1l = l111l11111I1l(strL1111l111111Il)) == null) {
                    return null;
                }
                return sharedPreferencesL111l11111I1l.getString(strL111l11111Il, "");
            } catch (Exception unused) {
                return "";
            }
        }

        public /* synthetic */ l111l11111I1l(byte b) {
            this();
        }
    }

    public static class l111l11111Il extends l1111l111111Il {
        private static final String l1111l111111Il = com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("d18b978a929d9c9e9c979aa0");
        private static final String[] l111l11111lIl = {com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("d19e919b908d969b"), com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("af969c8b8a8d9a8c"), com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("bb90889193909e9b"), com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("bb909c8a929a918b8c")};
        private List<String> l111l11111I1l;
        private String l111l11111Il;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public l111l11111Il(String str, String str2) {
            super(0 == true ? 1 : 0);
            this.l111l11111Il = str;
            String strOooO0O0 = o0oOO.OooO0O0(new StringBuilder(), l1111l111111Il, str2);
            this.l111l11111I1l = new ArrayList();
            String[] strArr = l111l11111lIl;
            for (int i = 0; i < 4; i++) {
                String str3 = strArr[i];
                List<String> list = this.l111l11111I1l;
                StringBuilder sbOooO00o = o0o0Oo.OooO00o(str3);
                sbOooO00o.append(File.separator);
                sbOooO00o.append(strOooO0O0);
                list.add(sbOooO00o.toString());
            }
        }

        @Override // com.ishumei.l1111l111111Il.l11l1111I1l.l1111l111111Il
        public final List<String> l1111l111111Il() {
            return this.l111l11111I1l;
        }

        @Override // com.ishumei.l1111l111111Il.l11l1111I1l.l111l11111lIl, com.ishumei.l1111l111111Il.l11l1111I1l.l111l1111lI1l
        public final void l111l11111lIl(String str) {
            try {
                super.l111l11111lIl(com.ishumei.l111l1111llIl.l111l1111lIl.l111l11111lIl((this.l111l11111Il + "_" + str).getBytes()));
            } catch (IOException unused) {
            }
        }
    }

    public static abstract class l111l11111lIl implements l111l1111lI1l {
        private ReadWriteLock l1111l111111Il;

        private l111l11111lIl() {
            this.l1111l111111Il = new ReentrantReadWriteLock(true);
        }

        public abstract void l1111l111111Il(String str);

        @Override // com.ishumei.l1111l111111Il.l11l1111I1l.l111l1111lI1l
        public final String l111l11111I1l() {
            try {
                if (!this.l1111l111111Il.readLock().tryLock(50L, TimeUnit.MILLISECONDS)) {
                    return "";
                }
                try {
                    return l111l11111lIl();
                } finally {
                    this.l1111l111111Il.readLock().unlock();
                }
            } catch (Exception unused) {
                return "";
            }
        }

        public abstract String l111l11111lIl();

        @Override // com.ishumei.l1111l111111Il.l11l1111I1l.l111l1111lI1l
        public void l111l11111lIl(String str) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                this.l1111l111111Il.writeLock().lock();
                l1111l111111Il(str);
            } catch (Exception unused) {
            } finally {
                this.l1111l111111Il.writeLock().unlock();
            }
        }

        public /* synthetic */ l111l11111lIl(byte b) {
            this();
        }
    }

    public static class l111l1111l1Il extends l1111l111111Il {
        private static final String l1111l111111Il = com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("8c978a929a96d18b878b");
        private List<String> l111l11111lIl;

        public l111l1111l1Il() {
            super((byte) 0);
            ArrayList arrayList = new ArrayList();
            this.l111l11111lIl = arrayList;
            arrayList.add(l1111l111111Il);
        }

        @Override // com.ishumei.l1111l111111Il.l11l1111I1l.l1111l111111Il
        public final List<String> l1111l111111Il() {
            return this.l111l11111lIl;
        }
    }

    public interface l111l1111lI1l {
        String l111l11111I1l();

        void l111l11111lIl(String str);
    }

    public static class l111l1111lIl extends l111l11111I1l {
        private String l1111l111111Il;

        public l111l1111lIl(String str) {
            super((byte) 0);
            Context context = com.ishumei.l1111l111111Il.l111l1111llIl.l1111l111111Il.l111l11111Il;
            if (context == null) {
                return;
            }
            try {
                this.l1111l111111Il = com.ishumei.l111l1111llIl.l111l1111lIl.l111l11111I1l(str + "_" + context.getPackageName());
            } catch (Exception unused) {
            }
        }

        @Override // com.ishumei.l1111l111111Il.l11l1111I1l.l111l11111I1l
        public final String l1111l111111Il() {
            return this.l1111l111111Il;
        }

        @Override // com.ishumei.l1111l111111Il.l11l1111I1l.l111l11111I1l
        public final String l111l11111Il() {
            return this.l1111l111111Il;
        }
    }

    public static class l111l1111llIl extends l1111l111111Il {
        private static final String l1111l111111Il = com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("d18b978a929d9c9e9c979aa0969b87a0");
        private static final String[] l111l11111lIl = {"", com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("bbbcb6b2"), com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("af969c8b8a8d9a8c"), com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("bb90889193909e9b"), com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("bb909c8a929a918b8c")};
        private List<String> l111l11111I1l;
        private String l111l11111Il;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public l111l1111llIl(String str) {
            super(0 == true ? 1 : 0);
            this.l111l11111Il = o0oOO.OooO0O0(new StringBuilder(), l1111l111111Il, str);
            this.l111l11111I1l = new ArrayList();
            String[] strArr = l111l11111lIl;
            for (int i = 0; i < 5; i++) {
                String str2 = strArr[i];
                List<String> list = this.l111l11111I1l;
                StringBuilder sbOooO00o = o0o0Oo.OooO00o(str2);
                sbOooO00o.append(File.separator);
                sbOooO00o.append(this.l111l11111Il);
                list.add(sbOooO00o.toString());
            }
        }

        @Override // com.ishumei.l1111l111111Il.l11l1111I1l.l1111l111111Il
        public final List<String> l1111l111111Il() {
            return this.l111l11111I1l;
        }

        @Override // com.ishumei.l1111l111111Il.l11l1111I1l.l1111l111111Il, com.ishumei.l1111l111111Il.l11l1111I1l.l111l11111lIl
        public final String l111l11111lIl() {
            String strL111l11111lIl = super.l111l11111lIl();
            return TextUtils.isEmpty(strL111l11111lIl) ? "" : SMSDK.xx6(strL111l11111lIl, this.l111l11111Il);
        }
    }

    public static class l11l1111I11l extends l111l11111I1l {
        private l11l1111I11l() {
            super((byte) 0);
        }

        @Override // com.ishumei.l1111l111111Il.l11l1111I1l.l111l11111I1l
        public final String l1111l111111Il() {
            return com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("9c9092d18c978a929a96");
        }

        @Override // com.ishumei.l1111l111111Il.l11l1111I1l.l111l11111I1l
        public final String l111l11111Il() {
            return com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("9b9a89969c9a969b");
        }

        public /* synthetic */ l11l1111I11l(byte b) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.ishumei.l1111l111111Il.l11l1111I1l$l11l1111I1l, reason: collision with other inner class name */
    public static class C0263l11l1111I1l extends l111l11111I1l {
        private static final String l1111l111111Il = com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("a08c978a929a96");

        private C0263l11l1111I1l() {
            super((byte) 0);
        }

        @Override // com.ishumei.l1111l111111Il.l11l1111I1l.l111l11111I1l
        public final String l1111l111111Il() {
            Context context = com.ishumei.l1111l111111Il.l111l1111llIl.l1111l111111Il.l111l11111Il;
            if (context == null) {
                return null;
            }
            return com.ishumei.l111l1111llIl.l111l1111lIl.l111l11111I1l(context.getPackageName() + l1111l111111Il);
        }

        @Override // com.ishumei.l1111l111111Il.l11l1111I1l.l111l11111I1l
        public final String l111l11111Il() {
            return l1111l111111Il();
        }

        @Override // com.ishumei.l1111l111111Il.l11l1111I1l.l111l11111I1l, com.ishumei.l1111l111111Il.l11l1111I1l.l111l11111lIl
        public final String l111l11111lIl() {
            String strL111l11111lIl = super.l111l11111lIl();
            return TextUtils.isEmpty(strL111l11111lIl) ? "" : SMSDK.xx6(strL111l11111lIl, l1111l111111Il());
        }

        public /* synthetic */ C0263l11l1111I1l(byte b) {
            this();
        }
    }

    public static class l11l1111lIIl extends l111l11111I1l {
        private static final String l1111l111111Il = com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("9c9092d18c978a929a96");
        private static final String l111l11111lIl = com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("9b9a89969c9a969b");

        public l11l1111lIIl() {
            super((byte) 0);
        }

        @Override // com.ishumei.l1111l111111Il.l11l1111I1l.l111l11111I1l
        public final String l1111l111111Il() {
            return l1111l111111Il;
        }

        @Override // com.ishumei.l1111l111111Il.l11l1111I1l.l111l11111I1l
        public final String l111l11111Il() {
            return l111l11111lIl;
        }
    }

    private l11l1111I1l() {
    }

    public static l11l1111I1l l1111l111111Il() {
        if (l111l1111lIl == null) {
            synchronized (l11l1111I1l.class) {
                if (l111l1111lIl == null) {
                    l111l1111lIl = new l11l1111I1l();
                }
            }
        }
        return l111l1111lIl;
    }

    public final synchronized String l111l11111I1l() {
        l111l1111lI1l l111l1111li1l = this.l111l11111I1l;
        if (l111l1111li1l == null) {
            return "";
        }
        return l111l1111li1l.l111l11111I1l();
    }

    public final synchronized String l111l11111Il() {
        Iterator it = Arrays.asList(this.l111l11111lIl, this.l111l1111llIl, this.l111l11111Il).iterator();
        while (it.hasNext()) {
            String strL111l11111I1l = ((l111l1111lI1l) it.next()).l111l11111I1l();
            if (!TextUtils.isEmpty(strL111l11111I1l)) {
                return strL111l11111I1l;
            }
        }
        return "";
    }

    public final synchronized String l111l11111lIl() {
        l111l1111lI1l l111l1111li1l = this.l111l11111lIl;
        if (l111l1111li1l == null) {
            return "";
        }
        return l111l1111li1l.l111l11111I1l();
    }

    private static String l1111l111111Il(List<l111l1111lI1l> list) {
        Iterator<l111l1111lI1l> it = list.iterator();
        while (it.hasNext()) {
            try {
                String strL111l11111I1l = it.next().l111l11111I1l();
                if (!TextUtils.isEmpty(strL111l11111I1l)) {
                    return strL111l11111I1l;
                }
            } catch (Throwable unused) {
            }
        }
        return "";
    }

    public final void l1111l111111Il(com.ishumei.l1111l111111Il.l111l11111lIl l111l11111lil) {
        l111l11111lil.l111l1111l1Il(this.l111l11111lIl.l111l11111I1l());
        l111l11111lil.l111l1111llIl(this.l111l11111I1l.l111l11111I1l());
        l111l11111lil.l11l11l1l1Il(this.l111l11111Il.l111l11111I1l());
        l111l11111lil.l11l11l1llIl(this.l111l1111l1Il.l111l11111I1l());
        l111l11111lil.l11l11l11Il(this.l111l1111llIl.l111l11111I1l());
        l111l11111lil.l111l11l11Ill(this.l111l1111lI1l.l111l11111I1l());
        l111l11111lil.l11l1111Il1l(l111l11111Il());
    }

    public final void l1111l111111Il(String str) {
        l111l1111lI1l l111l1111li1l = this.l111l11111lIl;
        if (l111l1111li1l != null) {
            l111l1111li1l.l111l11111lIl(str);
        }
        l111l1111lI1l l111l1111li1l2 = this.l111l11111I1l;
        if (l111l1111li1l2 != null) {
            l111l1111li1l2.l111l11111lIl(str);
        }
    }

    public final synchronized void l1111l111111Il(String str, String str2) {
        try {
            this.l111l11111lIl = new l111l1111lIl(str2);
            this.l111l11111I1l = new l111l11111Il(str2, str);
            byte b = 0;
            this.l111l11111Il = new l11l1111I11l(b);
            this.l111l1111l1Il = new l111l1111l1Il();
            this.l111l1111llIl = new C0263l11l1111I1l(b);
            this.l111l1111lI1l = new l111l1111llIl(str);
        } catch (Exception unused) {
        }
    }
}
