package androidx.media3.common;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.o0O00;
import com.google.common.collect.o0OoO00O;
import java.util.Collections;
import java.util.List;
import o000O000.OooO0o;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO00o f6218OooO00o = new OooO00o();

    public class OooO00o extends OooO0OO {
        @Override // androidx.media3.common.OooO0OO
        public final void OooO00o() {
        }

        @Override // androidx.media3.common.OooO0OO
        public final C0139OooO0OO OooO0O0() {
            throw new IndexOutOfBoundsException();
        }

        @Override // androidx.media3.common.OooO0OO
        public final void OooO0OO() {
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final AdPlaybackState f6219OooO00o = AdPlaybackState.f6138OooO0oO;

        static {
            OooO0o.OooO0oO(0);
            OooO0o.OooO0oO(1);
            OooO0o.OooO0oO(2);
            OooO0o.OooO0oO(3);
            OooO0o.OooO0oO(4);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !OooO0O0.class.equals(obj.getClass())) {
                return false;
            }
            return OooO0o.OooO00o(null, null) && OooO0o.OooO00o(null, null) && OooO0o.OooO00o(this.f6219OooO00o, ((OooO0O0) obj).f6219OooO00o);
        }

        public final int hashCode() {
            int i = (int) 0;
            return this.f6219OooO00o.hashCode() + ((((((6464647 + i) * 31) + i) * 31) + 0) * 31);
        }
    }

    /* JADX INFO: renamed from: androidx.media3.common.OooO0OO$OooO0OO, reason: collision with other inner class name */
    public static final class C0139OooO0OO {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final Object f6220OooO0OO = new Object();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final androidx.media3.common.OooO0O0 f6221OooO0Oo;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Object f6222OooO00o = f6220OooO0OO;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final androidx.media3.common.OooO0O0 f6223OooO0O0 = f6221OooO0Oo;

        static {
            androidx.media3.common.OooO0O0.OooO00o.C0137OooO00o c0137OooO00o = new androidx.media3.common.OooO0O0.OooO00o.C0137OooO00o();
            o0OoO00O o0ooo00o2 = o0OoO00O.f19626OooOO0;
            ImmutableList.OooO0O0 oooO0O0 = ImmutableList.f19157OooO0o0;
            o0O00 o0o01 = o0O00.f19536OooO0oo;
            List listEmptyList = Collections.emptyList();
            o0O00 o0o02 = o0O00.f19536OooO0oo;
            androidx.media3.common.OooO0O0.OooO0OO.OooO00o oooO00o = new androidx.media3.common.OooO0O0.OooO0OO.OooO00o();
            androidx.media3.common.OooO0O0.OooO oooO = androidx.media3.common.OooO0O0.OooO.f6191OooO00o;
            Uri uri = Uri.EMPTY;
            f6221OooO0Oo = new androidx.media3.common.OooO0O0("androidx.media3.common.Timeline", new androidx.media3.common.OooO0O0.C0138OooO0O0(c0137OooO00o), uri != null ? new androidx.media3.common.OooO0O0.OooO0o(uri, listEmptyList, o0o02) : null, new androidx.media3.common.OooO0O0.OooO0OO(oooO00o), MediaMetadata.f6162OooO00o, oooO);
            OooO0o.OooO0oO(1);
            OooO0o.OooO0oO(2);
            OooO0o.OooO0oO(3);
            OooO0o.OooO0oO(4);
            OooO0o.OooO0oO(5);
            OooO0o.OooO0oO(6);
            OooO0o.OooO0oO(7);
            OooO0o.OooO0oO(8);
            OooO0o.OooO0oO(9);
            OooO0o.OooO0oO(10);
            OooO0o.OooO0oO(11);
            OooO0o.OooO0oO(12);
            OooO0o.OooO0oO(13);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !C0139OooO0OO.class.equals(obj.getClass())) {
                return false;
            }
            C0139OooO0OO c0139OooO0OO = (C0139OooO0OO) obj;
            return OooO0o.OooO00o(this.f6222OooO00o, c0139OooO0OO.f6222OooO00o) && OooO0o.OooO00o(this.f6223OooO0O0, c0139OooO0OO.f6223OooO0O0) && OooO0o.OooO00o(null, null) && OooO0o.OooO00o(null, null);
        }

        public final int hashCode() {
            int i = (int) 0;
            return ((((((((((((((((((((((((((this.f6223OooO0O0.hashCode() + ((this.f6222OooO00o.hashCode() + 217) * 31)) * 31) + 0) * 31) + 0) * 31) + i) * 31) + i) * 31) + i) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + i) * 31) + i) * 31) + 0) * 31) + 0) * 31) + i;
        }
    }

    static {
        OooO0o.OooO0oO(0);
        OooO0o.OooO0oO(1);
        OooO0o.OooO0oO(2);
    }

    @UnstableApi
    public OooO0OO() {
    }

    public abstract void OooO00o();

    public abstract C0139OooO0OO OooO0O0();

    public abstract void OooO0OO();

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooO0OO)) {
            return false;
        }
        OooO0OO oooO0OO = (OooO0OO) obj;
        oooO0OO.OooO0OO();
        OooO0OO();
        oooO0OO.OooO00o();
        OooO00o();
        new C0139OooO0OO();
        new OooO0O0();
        new C0139OooO0OO();
        new OooO0O0();
        OooO0OO();
        OooO00o();
        OooO0OO();
        oooO0OO.OooO0OO();
        OooO0OO();
        oooO0OO.OooO0OO();
        return true;
    }

    public final int hashCode() {
        new C0139OooO0OO();
        new OooO0O0();
        OooO0OO();
        OooO0OO();
        OooO00o();
        OooO00o();
        OooO0OO();
        return 6727;
    }
}
