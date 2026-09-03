package p708oo000o;

import Oooo000.o000O00O;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.List;
import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p145o00Oo0.o00000O0;

/* JADX INFO: loaded from: classes.dex */
@Immutable
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final boolean f53095OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final String f53096OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f53097OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float f53098OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float f53099OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final o00O0O f53100OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final float f53101OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final long f53102OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f53103OooO0oo;

    @StabilityInferred(parameters = 0)
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        @NotNull
        public final ArrayList<C0436OooO00o> f53104OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final String f53105OooO00o = "";

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final float f53106OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final float f53107OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final float f53108OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final long f53109OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final float f53110OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final int f53111OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final boolean f53112OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        @NotNull
        public C0436OooO00o f53113OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public boolean f53114OooOO0O;

        /* JADX INFO: renamed from: oo000o.OooOOO0$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0436OooO00o {

            /* JADX INFO: renamed from: OooO, reason: collision with root package name */
            @NotNull
            public List<? extends OooOOOO> f53115OooO;

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            @NotNull
            public String f53116OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public float f53117OooO0O0;

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public float f53118OooO0OO;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public float f53119OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public float f53120OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public float f53121OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public float f53122OooO0oO;

            /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
            public float f53123OooO0oo;

            /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
            @NotNull
            public List<o00Ooo> f53124OooOO0;

            public C0436OooO00o() {
                this(null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, 1023);
            }

            public C0436OooO00o(String name, float f, float f2, float f3, float f4, float f5, float f6, float f7, List clipPathData, int i) {
                name = (i & 1) != 0 ? "" : name;
                f = (i & 2) != 0 ? ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : f;
                f2 = (i & 4) != 0 ? ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : f2;
                f3 = (i & 8) != 0 ? ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : f3;
                f4 = (i & 16) != 0 ? 1.0f : f4;
                f5 = (i & 32) != 0 ? 1.0f : f5;
                f6 = (i & 64) != 0 ? ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : f6;
                f7 = (i & 128) != 0 ? ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : f7;
                clipPathData = (i & 256) != 0 ? o00Oo0.f53217OooO00o : clipPathData;
                ArrayList children = (i & 512) != 0 ? new ArrayList() : null;
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(clipPathData, "clipPathData");
                Intrinsics.checkNotNullParameter(children, "children");
                this.f53116OooO00o = name;
                this.f53117OooO0O0 = f;
                this.f53118OooO0OO = f2;
                this.f53119OooO0Oo = f3;
                this.f53121OooO0o0 = f4;
                this.f53120OooO0o = f5;
                this.f53122OooO0oO = f6;
                this.f53123OooO0oo = f7;
                this.f53115OooO = clipPathData;
                this.f53124OooOO0 = children;
            }
        }

        public OooO00o(float f, float f2, float f3, float f4, long j, int i, boolean z) {
            this.f53106OooO0O0 = f;
            this.f53107OooO0OO = f2;
            this.f53108OooO0Oo = f3;
            this.f53110OooO0o0 = f4;
            this.f53109OooO0o = j;
            this.f53111OooO0oO = i;
            this.f53112OooO0oo = z;
            ArrayList<C0436OooO00o> backing = new ArrayList<>();
            Intrinsics.checkNotNullParameter(backing, "backing");
            this.f53104OooO = backing;
            C0436OooO00o c0436OooO00o = new C0436OooO00o(null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, 1023);
            this.f53113OooOO0 = c0436OooO00o;
            backing.add(c0436OooO00o);
        }

        @NotNull
        public final OooO00o OooO00o(@NotNull String name, float f, float f2, float f3, float f4, float f5, float f6, float f7, @NotNull List<? extends OooOOOO> clipPathData) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(clipPathData, "clipPathData");
            OooO0Oo();
            this.f53104OooO.add(new C0436OooO00o(name, f, f2, f3, f4, f5, f6, f7, clipPathData, 512));
            return this;
        }

        public final o00O0O OooO0O0(C0436OooO00o c0436OooO00o) {
            return new o00O0O(c0436OooO00o.f53116OooO00o, c0436OooO00o.f53117OooO0O0, c0436OooO00o.f53118OooO0OO, c0436OooO00o.f53119OooO0Oo, c0436OooO00o.f53121OooO0o0, c0436OooO00o.f53120OooO0o, c0436OooO00o.f53122OooO0oO, c0436OooO00o.f53123OooO0oo, c0436OooO00o.f53115OooO, c0436OooO00o.f53124OooOO0);
        }

        @NotNull
        public final OooO00o OooO0OO() {
            OooO0Oo();
            ArrayList<C0436OooO00o> arrayList = this.f53104OooO;
            C0436OooO00o c0436OooO00oRemove = arrayList.remove(arrayList.size() - 1);
            ArrayList<C0436OooO00o> arrayList2 = this.f53104OooO;
            arrayList2.get(arrayList2.size() - 1).f53124OooOO0.add(OooO0O0(c0436OooO00oRemove));
            return this;
        }

        public final void OooO0Oo() {
            if (!(!this.f53114OooOO0O)) {
                throw new IllegalStateException("ImageVector.Builder is single use, create a new instance to create a new ImageVector".toString());
            }
        }
    }

    public OooOOO0(String str, float f, float f2, float f3, float f4, o00O0O o00o0o2, long j, int i, boolean z) {
        this.f53096OooO00o = str;
        this.f53097OooO0O0 = f;
        this.f53098OooO0OO = f2;
        this.f53099OooO0Oo = f3;
        this.f53101OooO0o0 = f4;
        this.f53100OooO0o = o00o0o2;
        this.f53102OooO0oO = j;
        this.f53103OooO0oo = i;
        this.f53095OooO = z;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooOOO0)) {
            return false;
        }
        OooOOO0 oooOOO0 = (OooOOO0) obj;
        if (!Intrinsics.areEqual(this.f53096OooO00o, oooOOO0.f53096OooO00o) || !o0000O0O.OooOOO0.OooO00o(this.f53097OooO0O0, oooOOO0.f53097OooO0O0) || !o0000O0O.OooOOO0.OooO00o(this.f53098OooO0OO, oooOOO0.f53098OooO0OO)) {
            return false;
        }
        if (!(this.f53099OooO0Oo == oooOOO0.f53099OooO0Oo)) {
            return false;
        }
        if ((this.f53101OooO0o0 == oooOOO0.f53101OooO0o0) && Intrinsics.areEqual(this.f53100OooO0o, oooOOO0.f53100OooO0o) && o00000O0.OooO0Oo(this.f53102OooO0oO, oooOOO0.f53102OooO0oO)) {
            return (this.f53103OooO0oo == oooOOO0.f53103OooO0oo) && this.f53095OooO == oooOOO0.f53095OooO;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f53100OooO0o.hashCode() + o000O00O.OooO00o(this.f53101OooO0o0, o000O00O.OooO00o(this.f53099OooO0Oo, o000O00O.OooO00o(this.f53098OooO0OO, o000O00O.OooO00o(this.f53097OooO0O0, this.f53096OooO00o.hashCode() * 31, 31), 31), 31), 31)) * 31;
        long j = this.f53102OooO0oO;
        o00000O0.OooO00o oooO00o = o00000O0.f32063OooO0O0;
        return ((((ULong.m686hashCodeimpl(j) + iHashCode) * 31) + this.f53103OooO0oo) * 31) + (this.f53095OooO ? 1231 : 1237);
    }
}
