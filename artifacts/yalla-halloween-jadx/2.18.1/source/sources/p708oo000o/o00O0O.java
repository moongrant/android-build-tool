package p708oo000o;

import Oooo000.o000O00O;
import androidx.compose.runtime.Immutable;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Immutable
public final class o00O0O extends o00Ooo implements Iterable<o00Ooo>, KMappedMarker {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final float f53206Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final String f53207Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final float f53208Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final float f53209Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final float f53210OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final float f53211OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final float f53212OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final float f53213OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @NotNull
    public final List<OooOOOO> f53214OoooOO0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @NotNull
    public final List<o00Ooo> f53215o000oOoO;

    public static final class OooO00o implements Iterator<o00Ooo>, KMappedMarker {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        @NotNull
        public final Iterator<o00Ooo> f53216Oooo0o;

        public OooO00o(o00O0O o00o0o2) {
            this.f53216Oooo0o = o00o0o2.f53215o000oOoO.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f53216Oooo0o.hasNext();
        }

        @Override // java.util.Iterator
        public final o00Ooo next() {
            return this.f53216Oooo0o.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o00O0O(@NotNull String name, float f, float f2, float f3, float f4, float f5, float f6, float f7, @NotNull List<? extends OooOOOO> clipPathData, @NotNull List<? extends o00Ooo> children) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(clipPathData, "clipPathData");
        Intrinsics.checkNotNullParameter(children, "children");
        this.f53207Oooo0o = name;
        this.f53208Oooo0oO = f;
        this.f53209Oooo0oo = f2;
        this.f53206Oooo = f3;
        this.f53212OoooO00 = f4;
        this.f53211OoooO0 = f5;
        this.f53213OoooO0O = f6;
        this.f53210OoooO = f7;
        this.f53214OoooOO0 = clipPathData;
        this.f53215o000oOoO = children;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof o00O0O)) {
            return false;
        }
        o00O0O o00o0o2 = (o00O0O) obj;
        if (!Intrinsics.areEqual(this.f53207Oooo0o, o00o0o2.f53207Oooo0o)) {
            return false;
        }
        if (!(this.f53208Oooo0oO == o00o0o2.f53208Oooo0oO)) {
            return false;
        }
        if (!(this.f53209Oooo0oo == o00o0o2.f53209Oooo0oo)) {
            return false;
        }
        if (!(this.f53206Oooo == o00o0o2.f53206Oooo)) {
            return false;
        }
        if (!(this.f53212OoooO00 == o00o0o2.f53212OoooO00)) {
            return false;
        }
        if (!(this.f53211OoooO0 == o00o0o2.f53211OoooO0)) {
            return false;
        }
        if (this.f53213OoooO0O == o00o0o2.f53213OoooO0O) {
            return ((this.f53210OoooO > o00o0o2.f53210OoooO ? 1 : (this.f53210OoooO == o00o0o2.f53210OoooO ? 0 : -1)) == 0) && Intrinsics.areEqual(this.f53214OoooOO0, o00o0o2.f53214OoooOO0) && Intrinsics.areEqual(this.f53215o000oOoO, o00o0o2.f53215o000oOoO);
        }
        return false;
    }

    public final int hashCode() {
        return this.f53215o000oOoO.hashCode() + ((this.f53214OoooOO0.hashCode() + o000O00O.OooO00o(this.f53210OoooO, o000O00O.OooO00o(this.f53213OoooO0O, o000O00O.OooO00o(this.f53211OoooO0, o000O00O.OooO00o(this.f53212OoooO00, o000O00O.OooO00o(this.f53206Oooo, o000O00O.OooO00o(this.f53209Oooo0oo, o000O00O.OooO00o(this.f53208Oooo0oO, this.f53207Oooo0o.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31)) * 31);
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<o00Ooo> iterator() {
        return new OooO00o(this);
    }

    public o00O0O() {
        this("", ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f, 1.0f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, o00Oo0.f53217OooO00o, CollectionsKt.emptyList());
    }
}
