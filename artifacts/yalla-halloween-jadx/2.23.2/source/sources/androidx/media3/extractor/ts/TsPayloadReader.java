package androidx.media3.extractor.ts;

import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p080o000OoO.o000O000;
import p080o000OoO.o000O0Oo;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public interface TsPayloadReader {

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f9121OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final byte[] f9122OooO0O0;

        public OooO00o(String str, byte[] bArr) {
            this.f9121OooO00o = str;
            this.f9122OooO0O0 = bArr;
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public final String f9123OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final List<OooO00o> f9124OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final byte[] f9125OooO0OO;

        public OooO0O0(int i, @Nullable String str, @Nullable ArrayList arrayList, byte[] bArr) {
            this.f9123OooO00o = str;
            this.f9124OooO0O0 = arrayList == null ? Collections.emptyList() : Collections.unmodifiableList(arrayList);
            this.f9125OooO0OO = bArr;
        }
    }

    public interface OooO0OO {
        @Nullable
        TsPayloadReader OooO00o(int i, OooO0O0 oooO0O0);
    }

    public static final class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f9126OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f9127OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f9128OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f9129OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public String f9130OooO0o0;

        public OooO0o(int i, int i2) {
            this(Integer.MIN_VALUE, i, i2);
        }

        public final void OooO00o() {
            int i = this.f9129OooO0Oo;
            this.f9129OooO0Oo = i == Integer.MIN_VALUE ? this.f9127OooO0O0 : i + this.f9128OooO0OO;
            this.f9130OooO0o0 = this.f9126OooO00o + this.f9129OooO0Oo;
        }

        public final void OooO0O0() {
            if (this.f9129OooO0Oo == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public OooO0o(int i, int i2, int i3) {
            String str;
            if (i != Integer.MIN_VALUE) {
                str = i + "/";
            } else {
                str = "";
            }
            this.f9126OooO00o = str;
            this.f9127OooO0O0 = i2;
            this.f9128OooO0OO = i3;
            this.f9129OooO0Oo = Integer.MIN_VALUE;
            this.f9130OooO0o0 = "";
        }
    }

    void OooO00o(o000O0Oo o000o0oo2, o000OOoO.Oooo0 oooo0, OooO0o oooO0o);

    void OooO0O0();

    void OooO0OO(int i, o000O000 o000o001) throws ParserException;
}
