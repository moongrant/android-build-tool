package o000OOO;

import android.view.View;
import androidx.annotation.RestrictTo;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.Objects;
import o000OOO.OooO0O0;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooO0O0<T extends OooO0O0<T>> implements o000OOO.OooO00o.OooO0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public float f28267OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public float f28268OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public float f28269OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f28270OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Object f28271OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f28272OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o000OOO.OooO0OO f28273OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f28274OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f28275OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final ArrayList<OooOOO0> f28276OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final ArrayList<OooOOO> f28277OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final C0300OooO0O0 f28261OooOO0o = new C0300OooO0O0();

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final OooO0OO f28263OooOOO0 = new OooO0OO();

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final OooO0o f28262OooOOO = new OooO0o();

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final OooO f28264OooOOOO = new OooO();

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final OooOO0 f28265OooOOOo = new OooOO0();

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public static final OooO00o f28266OooOOo0 = new OooO00o();

    public static class OooO extends OooOOOO {
        public OooO() {
            super("rotationX");
        }

        @Override // o000OOO.OooO0OO
        public final float OooO0O0(Object obj) {
            return ((View) obj).getRotationX();
        }

        @Override // o000OOO.OooO0OO
        public final void OooO0o(Object obj, float f) {
            ((View) obj).setRotationX(f);
        }
    }

    public static class OooO00o extends OooOOOO {
        public OooO00o() {
            super("alpha");
        }

        @Override // o000OOO.OooO0OO
        public final float OooO0O0(Object obj) {
            return ((View) obj).getAlpha();
        }

        @Override // o000OOO.OooO0OO
        public final void OooO0o(Object obj, float f) {
            ((View) obj).setAlpha(f);
        }
    }

    /* JADX INFO: renamed from: o000OOO.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static class C0300OooO0O0 extends OooOOOO {
        public C0300OooO0O0() {
            super("scaleX");
        }

        @Override // o000OOO.OooO0OO
        public final float OooO0O0(Object obj) {
            return ((View) obj).getScaleX();
        }

        @Override // o000OOO.OooO0OO
        public final void OooO0o(Object obj, float f) {
            ((View) obj).setScaleX(f);
        }
    }

    public static class OooO0OO extends OooOOOO {
        public OooO0OO() {
            super("scaleY");
        }

        @Override // o000OOO.OooO0OO
        public final float OooO0O0(Object obj) {
            return ((View) obj).getScaleY();
        }

        @Override // o000OOO.OooO0OO
        public final void OooO0o(Object obj, float f) {
            ((View) obj).setScaleY(f);
        }
    }

    public static class OooO0o extends OooOOOO {
        public OooO0o() {
            super("rotation");
        }

        @Override // o000OOO.OooO0OO
        public final float OooO0O0(Object obj) {
            return ((View) obj).getRotation();
        }

        @Override // o000OOO.OooO0OO
        public final void OooO0o(Object obj, float f) {
            ((View) obj).setRotation(f);
        }
    }

    public static class OooOO0 extends OooOOOO {
        public OooOO0() {
            super("rotationY");
        }

        @Override // o000OOO.OooO0OO
        public final float OooO0O0(Object obj) {
            return ((View) obj).getRotationY();
        }

        @Override // o000OOO.OooO0OO
        public final void OooO0o(Object obj, float f) {
            ((View) obj).setRotationY(f);
        }
    }

    public static class OooOO0O {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public float f28278OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public float f28279OooO0O0;
    }

    public interface OooOOO {
        void OooO00o();
    }

    public interface OooOOO0 {
        void OooO00o();
    }

    public static abstract class OooOOOO extends o000OOO.OooO0OO {
        public OooOOOO(String str) {
        }
    }

    public OooO0O0(Object obj) {
        o000OOO.OooO0OO oooO0OO = o0OOO0O0.OooOO0O.f38076Ooooo0o;
        this.f28268OooO00o = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f28269OooO0O0 = Float.MAX_VALUE;
        this.f28270OooO0OO = false;
        this.f28272OooO0o = false;
        this.f28274OooO0oO = -3.4028235E38f;
        this.f28275OooO0oo = 0L;
        this.f28276OooOO0 = new ArrayList<>();
        this.f28277OooOO0O = new ArrayList<>();
        this.f28271OooO0Oo = obj;
        this.f28273OooO0o0 = oooO0OO;
        if (oooO0OO == f28262OooOOO || oooO0OO == f28264OooOOOO || oooO0OO == f28265OooOOOo) {
            this.f28267OooO = 0.1f;
            return;
        }
        if (oooO0OO == f28266OooOOo0) {
            this.f28267OooO = 0.00390625f;
        } else if (oooO0OO == f28261OooOO0o || oooO0OO == f28263OooOOO0) {
            this.f28267OooO = 0.00390625f;
        } else {
            this.f28267OooO = 1.0f;
        }
    }

    public static <T> void OooO0O0(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:30:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:34:0x0111  */
    /* JADX WARN: Code duplicated, block: B:36:0x0119  */
    /* JADX WARN: Code duplicated, block: B:42:0x0124 A[SYNTHETIC] */
    @Override // o000OOO.OooO00o.OooO0O0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final boolean OooO00o(long j) {
        boolean z;
        o000OOO.OooO00o OooO00o2;
        int iIndexOf;
        long j2 = this.f28275OooO0oo;
        if (j2 == 0) {
            this.f28275OooO0oo = j;
            OooO0OO(this.f28269OooO0O0);
            return false;
        }
        long j3 = j - j2;
        this.f28275OooO0oo = j;
        o000OOO.OooO0o oooO0o = (o000OOO.OooO0o) this;
        if (!oooO0o.f28282OooOo00) {
            if (oooO0o.f28281OooOOoo != Float.MAX_VALUE) {
                long j4 = j3 / 2;
                OooOO0O oooOO0OOooO0O0 = oooO0o.f28280OooOOo.OooO0O0(oooO0o.f28269OooO0O0, oooO0o.f28268OooO00o, j4);
                o000OOO.OooO oooO = oooO0o.f28280OooOOo;
                oooO.f28239OooO = oooO0o.f28281OooOOoo;
                oooO0o.f28281OooOOoo = Float.MAX_VALUE;
                OooOO0O oooOO0OOooO0O1 = oooO.OooO0O0(oooOO0OOooO0O0.f28278OooO00o, oooOO0OOooO0O0.f28279OooO0O0, j4);
                oooO0o.f28269OooO0O0 = oooOO0OOooO0O1.f28278OooO00o;
                oooO0o.f28268OooO00o = oooOO0OOooO0O1.f28279OooO0O0;
            } else {
                OooOO0O oooOO0OOooO0O2 = oooO0o.f28280OooOOo.OooO0O0(oooO0o.f28269OooO0O0, oooO0o.f28268OooO00o, j3);
                oooO0o.f28269OooO0O0 = oooOO0OOooO0O2.f28278OooO00o;
                oooO0o.f28268OooO00o = oooOO0OOooO0O2.f28279OooO0O0;
            }
            float fMax = Math.max(oooO0o.f28269OooO0O0, oooO0o.f28274OooO0oO);
            oooO0o.f28269OooO0O0 = fMax;
            float fMin = Math.min(fMax, Float.MAX_VALUE);
            oooO0o.f28269OooO0O0 = fMin;
            float f = oooO0o.f28268OooO00o;
            o000OOO.OooO oooO2 = oooO0o.f28280OooOOo;
            Objects.requireNonNull(oooO2);
            if (((double) Math.abs(f)) < oooO2.f28245OooO0o0 && ((double) Math.abs(fMin - ((float) oooO2.f28239OooO))) < oooO2.f28243OooO0Oo) {
                oooO0o.f28269OooO0O0 = (float) oooO0o.f28280OooOOo.f28239OooO;
                oooO0o.f28268OooO00o = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            } else {
                z = false;
            }
            float fMin2 = Math.min(this.f28269OooO0O0, Float.MAX_VALUE);
            this.f28269OooO0O0 = fMin2;
            float fMax2 = Math.max(fMin2, this.f28274OooO0oO);
            this.f28269OooO0O0 = fMax2;
            OooO0OO(fMax2);
            if (z) {
                this.f28272OooO0o = false;
                OooO00o2 = o000OOO.OooO00o.OooO00o();
                OooO00o2.f28250OooO00o.remove(this);
                iIndexOf = OooO00o2.f28251OooO0O0.indexOf(this);
                if (iIndexOf >= 0) {
                    OooO00o2.f28251OooO0O0.set(iIndexOf, null);
                    OooO00o2.f28254OooO0o = true;
                }
                this.f28275OooO0oo = 0L;
                this.f28270OooO0OO = false;
                for (int i = 0; i < this.f28276OooOO0.size(); i++) {
                    if (this.f28276OooOO0.get(i) != null) {
                        this.f28276OooOO0.get(i).OooO00o();
                    }
                }
                OooO0O0(this.f28276OooOO0);
            }
            return z;
        }
        float f2 = oooO0o.f28281OooOOoo;
        if (f2 != Float.MAX_VALUE) {
            oooO0o.f28280OooOOo.f28239OooO = f2;
            oooO0o.f28281OooOOoo = Float.MAX_VALUE;
        }
        oooO0o.f28269OooO0O0 = (float) oooO0o.f28280OooOOo.f28239OooO;
        oooO0o.f28268OooO00o = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        oooO0o.f28282OooOo00 = false;
        z = true;
        float fMin3 = Math.min(this.f28269OooO0O0, Float.MAX_VALUE);
        this.f28269OooO0O0 = fMin3;
        float fMax3 = Math.max(fMin3, this.f28274OooO0oO);
        this.f28269OooO0O0 = fMax3;
        OooO0OO(fMax3);
        if (z) {
            this.f28272OooO0o = false;
            OooO00o2 = o000OOO.OooO00o.OooO00o();
            OooO00o2.f28250OooO00o.remove(this);
            iIndexOf = OooO00o2.f28251OooO0O0.indexOf(this);
            if (iIndexOf >= 0) {
                OooO00o2.f28251OooO0O0.set(iIndexOf, null);
                OooO00o2.f28254OooO0o = true;
            }
            this.f28275OooO0oo = 0L;
            this.f28270OooO0OO = false;
            while (i < this.f28276OooOO0.size()) {
                if (this.f28276OooOO0.get(i) != null) {
                    this.f28276OooOO0.get(i).OooO00o();
                }
            }
            OooO0O0(this.f28276OooOO0);
        }
        return z;
    }

    public final void OooO0OO(float f) {
        this.f28273OooO0o0.OooO0o(this.f28271OooO0Oo, f);
        for (int i = 0; i < this.f28277OooOO0O.size(); i++) {
            if (this.f28277OooOO0O.get(i) != null) {
                this.f28277OooOO0O.get(i).OooO00o();
            }
        }
        OooO0O0(this.f28277OooOO0O);
    }
}
