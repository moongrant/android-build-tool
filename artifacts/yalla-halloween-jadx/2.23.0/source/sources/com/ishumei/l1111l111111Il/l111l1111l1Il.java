package com.ishumei.l1111l111111Il;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class l111l1111l1Il {
    private static final String l1111l111111Il = "sm";
    private static final String l111l11111lIl = "seq";
    private static l111l1111l1Il l111l1111l1Il;
    private Context l111l11111Il;
    private int l111l11111I1l = 0;
    private com.ishumei.l111l11111I1l.l111l11111lIl l111l1111llIl = new com.ishumei.l111l11111I1l.l111l11111lIl(true, 7) { // from class: com.ishumei.l1111l111111Il.l111l1111l1Il.1
        {
            super(true, 7);
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                l111l1111l1Il l111l1111l1il = l111l1111l1Il.this;
                StringBuilder sb = new StringBuilder();
                sb.append(l111l1111l1Il.this.l111l11111I1l);
                l111l1111l1Il.l1111l111111Il(l111l1111l1il, sb.toString());
            } catch (Throwable unused) {
            }
        }
    };

    private l111l1111l1Il() {
        this.l111l11111Il = null;
        this.l111l11111Il = l111l1111llIl.l1111l111111Il.l111l11111Il;
    }

    private String l111l11111I1l() throws Exception {
        try {
            Context context = this.l111l11111Il;
            if (context == null) {
                throw new Exception("mContext == null");
            }
            String string = context.getSharedPreferences(l111l11111lIl, 0).getString(l111l11111lIl, null);
            if (com.ishumei.l111l1111llIl.l111l1111lI1l.l1111l111111Il(string)) {
                throw new Exception("from shared preference empty id");
            }
            return string;
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    private String l111l11111Il() {
        try {
            String strL111l11111I1l = l111l11111I1l();
            try {
                return com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111lIl(strL111l11111I1l) ? strL111l11111I1l : strL111l11111I1l;
            } catch (Exception unused) {
                return strL111l11111I1l;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    public final synchronized String l111l11111lIl() {
        String strL111l11111Il;
        StringBuilder sb;
        if (this.l111l11111I1l == 0) {
            try {
                strL111l11111Il = l111l11111Il();
            } catch (Exception unused) {
                strL111l11111Il = null;
            }
            if (com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111lIl(strL111l11111Il)) {
                try {
                    this.l111l11111I1l = Integer.parseInt(strL111l11111Il);
                } catch (Exception unused2) {
                }
            }
        }
        this.l111l11111I1l++;
        this.l111l1111llIl.l1111l111111Il();
        sb = new StringBuilder();
        sb.append(this.l111l11111I1l);
        return sb.toString();
    }

    public static l111l1111l1Il l1111l111111Il() {
        if (l111l1111l1Il == null) {
            synchronized (l111l1111l1Il.class) {
                if (l111l1111l1Il == null) {
                    l111l1111l1Il = new l111l1111l1Il();
                }
            }
        }
        return l111l1111l1Il;
    }

    public static /* synthetic */ void l1111l111111Il(l111l1111l1Il l111l1111l1il, String str) throws Exception {
        try {
            Context context = l111l1111l1il.l111l11111Il;
            if (context == null) {
                throw new Exception("mContext == null");
            }
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(l111l11111lIl, 0).edit();
            editorEdit.putString(l111l11111lIl, str);
            if (!editorEdit.commit()) {
                throw new IOException("editor commit failed");
            }
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    private void l1111l111111Il(String str) throws Exception {
        try {
            Context context = this.l111l11111Il;
            if (context == null) {
                throw new Exception("mContext == null");
            }
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(l111l11111lIl, 0).edit();
            editorEdit.putString(l111l11111lIl, str);
            if (!editorEdit.commit()) {
                throw new IOException("editor commit failed");
            }
        } catch (Exception e) {
            throw new Exception(e);
        }
    }
}
