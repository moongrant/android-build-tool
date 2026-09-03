package p120o00O0OoO;

import android.view.animation.Interpolator;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p131o00O0oo0.o000000O;
import p131o00O0oo0.o000OOo;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooOO0O<K, A> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO0OO<K> f30767OooO0OO;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public o000000O<A> f30770OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<OooO00o> f30765OooO00o = new ArrayList(1);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f30766OooO0O0 = false;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public float f30768OooO0Oo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public A f30769OooO0o = null;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f30771OooO0oO = -1.0f;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public float f30772OooO0oo = -1.0f;

    public static final class OooO<T> implements OooO0OO<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public final o000OOo<T> f30773OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public float f30774OooO0O0 = -1.0f;

        public OooO(List<? extends o000OOo<T>> list) {
            this.f30773OooO00o = list.get(0);
        }

        @Override // o00O0OoO.OooOO0O.OooO0OO
        public final boolean OooO00o(float f) {
            if (this.f30774OooO0O0 == f) {
                return true;
            }
            this.f30774OooO0O0 = f;
            return false;
        }

        @Override // o00O0OoO.OooOO0O.OooO0OO
        public final o000OOo<T> OooO0O0() {
            return this.f30773OooO00o;
        }

        @Override // o00O0OoO.OooOO0O.OooO0OO
        public final boolean OooO0OO(float f) {
            return !this.f30773OooO00o.OooO0OO();
        }

        @Override // o00O0OoO.OooOO0O.OooO0OO
        public final float OooO0Oo() {
            return this.f30773OooO00o.OooO00o();
        }

        @Override // o00O0OoO.OooOO0O.OooO0OO
        public final float OooO0o0() {
            return this.f30773OooO00o.OooO0O0();
        }

        @Override // o00O0OoO.OooOO0O.OooO0OO
        public final boolean isEmpty() {
            return false;
        }
    }

    public interface OooO00o {
        void OooO0O0();
    }

    public static final class OooO0O0<T> implements OooO0OO<T> {
        @Override // o00O0OoO.OooOO0O.OooO0OO
        public final boolean OooO00o(float f) {
            throw new IllegalStateException("not implemented");
        }

        @Override // o00O0OoO.OooOO0O.OooO0OO
        public final o000OOo<T> OooO0O0() {
            throw new IllegalStateException("not implemented");
        }

        @Override // o00O0OoO.OooOO0O.OooO0OO
        public final boolean OooO0OO(float f) {
            return false;
        }

        @Override // o00O0OoO.OooOO0O.OooO0OO
        public final float OooO0Oo() {
            return 1.0f;
        }

        @Override // o00O0OoO.OooOO0O.OooO0OO
        public final float OooO0o0() {
            return ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        }

        @Override // o00O0OoO.OooOO0O.OooO0OO
        public final boolean isEmpty() {
            return true;
        }
    }

    public interface OooO0OO<T> {
        boolean OooO00o(float f);

        o000OOo<T> OooO0O0();

        boolean OooO0OO(float f);

        @FloatRange(from = 0.0d, to = 1.0d)
        float OooO0Oo();

        @FloatRange(from = 0.0d, to = 1.0d)
        float OooO0o0();

        boolean isEmpty();
    }

    public static final class OooO0o<T> implements OooO0OO<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final List<? extends o000OOo<T>> f30775OooO00o;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public o000OOo<T> f30777OooO0OO = null;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public float f30778OooO0Oo = -1.0f;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NonNull
        public o000OOo<T> f30776OooO0O0 = OooO0o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);

        public OooO0o(List<? extends o000OOo<T>> list) {
            this.f30775OooO00o = list;
        }

        @Override // o00O0OoO.OooOO0O.OooO0OO
        public final boolean OooO00o(float f) {
            o000OOo<T> o000ooo2 = this.f30777OooO0OO;
            o000OOo<T> o000ooo3 = this.f30776OooO0O0;
            if (o000ooo2 == o000ooo3 && this.f30778OooO0Oo == f) {
                return true;
            }
            this.f30777OooO0OO = o000ooo3;
            this.f30778OooO0Oo = f;
            return false;
        }

        @Override // o00O0OoO.OooOO0O.OooO0OO
        @NonNull
        public final o000OOo<T> OooO0O0() {
            return this.f30776OooO0O0;
        }

        @Override // o00O0OoO.OooOO0O.OooO0OO
        public final boolean OooO0OO(float f) {
            o000OOo<T> o000ooo2 = this.f30776OooO0O0;
            if (f >= o000ooo2.OooO0O0() && f < o000ooo2.OooO00o()) {
                return !this.f30776OooO0O0.OooO0OO();
            }
            this.f30776OooO0O0 = OooO0o(f);
            return true;
        }

        @Override // o00O0OoO.OooOO0O.OooO0OO
        public final float OooO0Oo() {
            List<? extends o000OOo<T>> list = this.f30775OooO00o;
            return list.get(list.size() - 1).OooO00o();
        }

        public final o000OOo<T> OooO0o(float f) {
            List<? extends o000OOo<T>> list = this.f30775OooO00o;
            o000OOo<T> o000ooo2 = list.get(list.size() - 1);
            if (f >= o000ooo2.OooO0O0()) {
                return o000ooo2;
            }
            int size = this.f30775OooO00o.size() - 2;
            while (true) {
                boolean z = false;
                if (size < 1) {
                    return this.f30775OooO00o.get(0);
                }
                o000OOo<T> o000ooo3 = this.f30775OooO00o.get(size);
                if (this.f30776OooO0O0 != o000ooo3) {
                    if (f >= o000ooo3.OooO0O0() && f < o000ooo3.OooO00o()) {
                        z = true;
                    }
                    if (z) {
                        return o000ooo3;
                    }
                }
                size--;
            }
        }

        @Override // o00O0OoO.OooOO0O.OooO0OO
        public final float OooO0o0() {
            return this.f30775OooO00o.get(0).OooO0O0();
        }

        @Override // o00O0OoO.OooOO0O.OooO0OO
        public final boolean isEmpty() {
            return false;
        }
    }

    public OooOO0O(List<? extends o000OOo<K>> list) {
        OooO0OO<K> oooO;
        if (list.isEmpty()) {
            oooO = new OooO0O0<>();
        } else {
            oooO = list.size() == 1 ? new OooO<>(list) : new OooO0o<>(list);
        }
        this.f30767OooO0OO = oooO;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<o00O0OoO.OooOO0O$OooO00o>] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList, java.util.List<o00O0OoO.OooOO0O$OooO00o>] */
    public void OooO() {
        for (int i = 0; i < this.f30765OooO00o.size(); i++) {
            ((OooO00o) this.f30765OooO00o.get(i)).OooO0O0();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<o00O0OoO.OooOO0O$OooO00o>] */
    public final void OooO00o(OooO00o oooO00o) {
        this.f30765OooO00o.add(oooO00o);
    }

    public final o000OOo<K> OooO0O0() {
        o000OOo<K> o000oooOooO0O0 = this.f30767OooO0OO.OooO0O0();
        com.airbnb.lottie.OooO0o.OooO00o();
        return o000oooOooO0O0;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float OooO0OO() {
        if (this.f30772OooO0oo == -1.0f) {
            this.f30772OooO0oo = this.f30767OooO0OO.OooO0Oo();
        }
        return this.f30772OooO0oo;
    }

    public final float OooO0Oo() {
        o000OOo<K> o000oooOooO0O0 = OooO0O0();
        return o000oooOooO0O0.OooO0OO() ? ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : o000oooOooO0O0.f31159OooO0Oo.getInterpolation(OooO0o0());
    }

    public A OooO0o() {
        float fOooO0o0 = OooO0o0();
        if (this.f30770OooO0o0 == null && this.f30767OooO0OO.OooO00o(fOooO0o0)) {
            return this.f30769OooO0o;
        }
        o000OOo<K> o000oooOooO0O0 = OooO0O0();
        Interpolator interpolator = o000oooOooO0O0.f31161OooO0o0;
        A aOooO0oO = (interpolator == null || o000oooOooO0O0.f31160OooO0o == null) ? OooO0oO(o000oooOooO0O0, OooO0Oo()) : OooO0oo(o000oooOooO0O0, fOooO0o0, interpolator.getInterpolation(fOooO0o0), o000oooOooO0O0.f31160OooO0o.getInterpolation(fOooO0o0));
        this.f30769OooO0o = aOooO0oO;
        return aOooO0oO;
    }

    public final float OooO0o0() {
        if (this.f30766OooO0O0) {
            return ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        }
        o000OOo<K> o000oooOooO0O0 = OooO0O0();
        return o000oooOooO0O0.OooO0OO() ? ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : (this.f30768OooO0Oo - o000oooOooO0O0.OooO0O0()) / (o000oooOooO0O0.OooO00o() - o000oooOooO0O0.OooO0O0());
    }

    public abstract A OooO0oO(o000OOo<K> o000ooo2, float f);

    public A OooO0oo(o000OOo<K> o000ooo2, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void OooOO0(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        if (this.f30767OooO0OO.isEmpty()) {
            return;
        }
        if (this.f30771OooO0oO == -1.0f) {
            this.f30771OooO0oO = this.f30767OooO0OO.OooO0o0();
        }
        float f2 = this.f30771OooO0oO;
        if (f < f2) {
            if (f2 == -1.0f) {
                this.f30771OooO0oO = this.f30767OooO0OO.OooO0o0();
            }
            f = this.f30771OooO0oO;
        } else if (f > OooO0OO()) {
            f = OooO0OO();
        }
        if (f == this.f30768OooO0Oo) {
            return;
        }
        this.f30768OooO0Oo = f;
        if (this.f30767OooO0OO.OooO0OO(f)) {
            OooO();
        }
    }

    public final void OooOO0O(@Nullable o000000O<A> o000000o2) {
        o000000O<A> o000000o3 = this.f30770OooO0o0;
        if (o000000o3 != null) {
            Objects.requireNonNull(o000000o3);
        }
        this.f30770OooO0o0 = o000000o2;
    }
}
