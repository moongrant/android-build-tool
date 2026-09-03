package p023Oooo00O;

import Oooo000.o000O00O;
import androidx.compose.runtime.Immutable;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Immutable
public final class o00O000o<T> implements o0000O0O<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f1127OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f1128OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final T f1129OooO0OO;

    public o00O000o() {
        this(null, 7);
    }

    public o00O000o(float f, float f2, @Nullable T t) {
        this.f1127OooO00o = f;
        this.f1128OooO0O0 = f2;
        this.f1129OooO0OO = t;
    }

    @Override // p023Oooo00O.oo000o
    public final o00OOO00 OooO00o(o00OO0O0 converter) {
        Intrinsics.checkNotNullParameter(converter, "converter");
        float f = this.f1127OooO00o;
        float f2 = this.f1128OooO0O0;
        T t = this.f1129OooO0OO;
        return new o0O0o(f, f2, t == null ? null : (o0O0O00) converter.OooO00o().invoke(t));
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof o00O000o) {
            o00O000o o00o000o2 = (o00O000o) obj;
            if (o00o000o2.f1127OooO00o == this.f1127OooO00o) {
                if ((o00o000o2.f1128OooO0O0 == this.f1128OooO0O0) && Intrinsics.areEqual(o00o000o2.f1129OooO0OO, this.f1129OooO0OO)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        T t = this.f1129OooO0OO;
        return Float.floatToIntBits(this.f1128OooO0O0) + o000O00O.OooO00o(this.f1127OooO00o, (t != null ? t.hashCode() : 0) * 31, 31);
    }

    public /* synthetic */ o00O000o(Object obj, int i) {
        this((i & 1) != 0 ? 1.0f : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, (i & 2) != 0 ? 1500.0f : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, (i & 4) != 0 ? null : obj);
    }
}
