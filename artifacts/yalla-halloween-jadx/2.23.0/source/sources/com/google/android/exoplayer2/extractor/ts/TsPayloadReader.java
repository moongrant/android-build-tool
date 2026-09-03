package com.google.android.exoplayer2.extractor.ts;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p209o00o0oo0.o00O0O0;
import p245o00oo0o.o00Oo00;
import p245o00oo0o.o0O0000O;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public interface TsPayloadReader {

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f12354OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final byte[] f12355OooO0O0;

        public OooO00o(String str, byte[] bArr) {
            this.f12354OooO00o = str;
            this.f12355OooO0O0 = bArr;
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public final String f12356OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final List<OooO00o> f12357OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final byte[] f12358OooO0OO;

        public OooO0O0(int i, @Nullable String str, @Nullable ArrayList arrayList, byte[] bArr) {
            this.f12356OooO00o = str;
            this.f12357OooO0O0 = arrayList == null ? Collections.emptyList() : Collections.unmodifiableList(arrayList);
            this.f12358OooO0OO = bArr;
        }
    }

    public interface OooO0OO {
        @Nullable
        TsPayloadReader OooO00o(int i, OooO0O0 oooO0O0);
    }

    public static final class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f12359OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f12360OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f12361OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f12362OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public String f12363OooO0o0;

        public OooO0o(int i, int i2) {
            this(Integer.MIN_VALUE, i, i2);
        }

        public final void OooO00o() {
            int i = this.f12362OooO0Oo;
            this.f12362OooO0Oo = i == Integer.MIN_VALUE ? this.f12360OooO0O0 : i + this.f12361OooO0OO;
            this.f12363OooO0o0 = this.f12359OooO00o + this.f12362OooO0Oo;
        }

        public final void OooO0O0() {
            if (this.f12362OooO0Oo == Integer.MIN_VALUE) {
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
            this.f12359OooO00o = str;
            this.f12360OooO0O0 = i2;
            this.f12361OooO0OO = i3;
            this.f12362OooO0Oo = Integer.MIN_VALUE;
            this.f12363OooO0o0 = "";
        }
    }

    void OooO00o(o0O0000O o0o0000o2, o00O0O0 o00o0o0, OooO0o oooO0o);

    void OooO0O0(int i, o00Oo00 o00oo00) throws ParserException;

    void OooO0OO();
}
