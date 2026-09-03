package com.google.android.exoplayer2.extractor.ts;

import androidx.annotation.Nullable;
import com.android.billingclient.api.o0OO00O;
import com.google.android.exoplayer2.ParserException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.List;
import p318o0O0oOo.o000;
import p318o0O0oOo.o000O0O0;

/* JADX INFO: loaded from: classes2.dex */
public interface TsPayloadReader {

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f14287OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final byte[] f14288OooO0O0;

        public OooO00o(String str, byte[] bArr) {
            this.f14287OooO00o = str;
            this.f14288OooO0O0 = bArr;
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public final String f14289OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final List<OooO00o> f14290OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final byte[] f14291OooO0OO;

        public OooO0O0(int i, @Nullable String str, @Nullable List<OooO00o> list, byte[] bArr) {
            this.f14289OooO00o = str;
            this.f14290OooO0O0 = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
            this.f14291OooO0OO = bArr;
        }
    }

    public interface OooO0OO {
        @Nullable
        TsPayloadReader OooO00o(int i, OooO0O0 oooO0O0);
    }

    public static final class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f14292OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f14293OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f14294OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f14295OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public String f14296OooO0o0;

        public OooO0o(int i, int i2) {
            this(Integer.MIN_VALUE, i, i2);
        }

        public final void OooO00o() {
            int i = this.f14295OooO0Oo;
            int i2 = i == Integer.MIN_VALUE ? this.f14293OooO0O0 : i + this.f14294OooO0OO;
            this.f14295OooO0Oo = i2;
            String str = this.f14292OooO00o;
            this.f14296OooO0o0 = p265o00ooo00.Oooo0.OooO00o(o0OO00O.OooO00o(str, 11), str, i2);
        }

        public final String OooO0O0() {
            if (this.f14295OooO0Oo != Integer.MIN_VALUE) {
                return this.f14296OooO0o0;
            }
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }

        public final int OooO0OO() {
            int i = this.f14295OooO0Oo;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }

        public OooO0o(int i, int i2, int i3) {
            String string;
            if (i != Integer.MIN_VALUE) {
                StringBuilder sb = new StringBuilder(12);
                sb.append(i);
                sb.append("/");
                string = sb.toString();
            } else {
                string = "";
            }
            this.f14292OooO00o = string;
            this.f14293OooO0O0 = i2;
            this.f14294OooO0OO = i3;
            this.f14295OooO0Oo = Integer.MIN_VALUE;
            this.f14296OooO0o0 = "";
        }
    }

    void OooO00o(o000 o000Var, int i) throws ParserException;

    void OooO0O0();

    void OooO0OO(o000O0O0 o000o0o1, p296o0O0OoO0.o0OoOo0 o0oooo1, OooO0o oooO0o);
}
