package p118o00O0Oo;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinVersion;
import oo0oOO0.OooO00o;
import p120o00O0OoO.o0ooOOo;
import p123o00O0o0.o00O0O;
import p125o00O0o0O.o0000Ooo;
import p125o00O0o0O.o000OOo;
import p129o00O0oOo.o000O0Oo;
import p131o00O0oo0.o000000O;
import p225o00oOOo.o00O0OOO;
import p225o00oOOo.oo0oOO0;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O implements OooOOO0, o0OoOo0, o00O0OoO.OooOO0O.OooO00o, oo0oOO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final LottieDrawable f30627OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f30628OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final RectF f30629OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Matrix f30630OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Path f30631OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final String f30632OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final RectF f30633OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f30634OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final List<OooOO0> f30635OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public List<o0OoOo0> f30636OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public o0ooOOo f30637OooOO0O;

    public OooOO0O(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.OooO00o oooO00o, o0000Ooo o0000ooo) {
        o00O0O o00o0o2;
        String str = o0000ooo.f31019OooO00o;
        boolean z = o0000ooo.f31021OooO0OO;
        List<o000OOo> list = o0000ooo.f31020OooO0O0;
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            OooOO0 oooOO0OooO00o = list.get(i).OooO00o(lottieDrawable, oooO00o);
            if (oooOO0OooO00o != null) {
                arrayList.add(oooOO0OooO00o);
            }
        }
        List<o000OOo> list2 = o0000ooo.f31020OooO0O0;
        for (int i2 = 0; i2 < list2.size(); i2++) {
            o000OOo o000ooo2 = list2.get(i2);
            if (o000ooo2 instanceof o00O0O) {
                o00o0o2 = (o00O0O) o000ooo2;
                this(lottieDrawable, oooO00o, str, z, arrayList, o00o0o2);
            }
        }
        o00o0o2 = null;
        this(lottieDrawable, oooO00o, str, z, arrayList, o00o0o2);
    }

    @Override // p118o00O0Oo.o0OoOo0
    public final Path OooO00o() {
        this.f30630OooO0OO.reset();
        o0ooOOo o0ooooo2 = this.f30637OooOO0O;
        if (o0ooooo2 != null) {
            this.f30630OooO0OO.set(o0ooooo2.OooO0o0());
        }
        this.f30631OooO0Oo.reset();
        if (this.f30634OooO0oO) {
            return this.f30631OooO0Oo;
        }
        for (int size = this.f30635OooO0oo.size() - 1; size >= 0; size--) {
            OooOO0 oooOO1 = this.f30635OooO0oo.get(size);
            if (oooOO1 instanceof o0OoOo0) {
                this.f30631OooO0Oo.addPath(((o0OoOo0) oooOO1).OooO00o(), this.f30630OooO0OO);
            }
        }
        return this.f30631OooO0Oo;
    }

    @Override // o00O0OoO.OooOO0O.OooO00o
    public final void OooO0O0() {
        this.f30627OooO.invalidateSelf();
    }

    @Override // p118o00O0Oo.OooOO0
    public final void OooO0OO(List<OooOO0> list, List<OooOO0> list2) {
        ArrayList arrayList = new ArrayList(this.f30635OooO0oo.size() + list.size());
        arrayList.addAll(list);
        int size = this.f30635OooO0oo.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            OooOO0 oooOO1 = this.f30635OooO0oo.get(size);
            oooOO1.OooO0OO(arrayList, this.f30635OooO0oo.subList(0, size));
            arrayList.add(oooOO1);
        }
    }

    @Override // p225o00oOOo.oo0oOO0
    public final void OooO0Oo(o00O0OOO o00o0ooo2, int i, List<o00O0OOO> list, o00O0OOO o00o0ooo3) {
        if (o00o0ooo2.OooO0o0(this.f30632OooO0o, i) || "__container".equals(this.f30632OooO0o)) {
            if (!"__container".equals(this.f30632OooO0o)) {
                o00o0ooo3 = o00o0ooo3.OooO00o(this.f30632OooO0o);
                if (o00o0ooo2.OooO0OO(this.f30632OooO0o, i)) {
                    list.add(o00o0ooo3.OooO0oO(this));
                }
            }
            if (o00o0ooo2.OooO0o(this.f30632OooO0o, i)) {
                int iOooO0Oo = o00o0ooo2.OooO0Oo(this.f30632OooO0o, i) + i;
                for (int i2 = 0; i2 < this.f30635OooO0oo.size(); i2++) {
                    OooOO0 oooOO1 = this.f30635OooO0oo.get(i2);
                    if (oooOO1 instanceof oo0oOO0) {
                        ((oo0oOO0) oooOO1).OooO0Oo(o00o0ooo2, iOooO0Oo, list, o00o0ooo3);
                    }
                }
            }
        }
    }

    @Override // p118o00O0Oo.OooOOO0
    public final void OooO0o(RectF rectF, Matrix matrix, boolean z) {
        this.f30630OooO0OO.set(matrix);
        o0ooOOo o0ooooo2 = this.f30637OooOO0O;
        if (o0ooooo2 != null) {
            this.f30630OooO0OO.preConcat(o0ooooo2.OooO0o0());
        }
        this.f30633OooO0o0.set(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        for (int size = this.f30635OooO0oo.size() - 1; size >= 0; size--) {
            OooOO0 oooOO1 = this.f30635OooO0oo.get(size);
            if (oooOO1 instanceof OooOOO0) {
                ((OooOOO0) oooOO1).OooO0o(this.f30633OooO0o0, this.f30630OooO0OO, z);
                rectF.union(this.f30633OooO0o0);
            }
        }
    }

    @Override // p225o00oOOo.oo0oOO0
    public final <T> void OooO0o0(T t, @Nullable o000000O<T> o000000o2) {
        o0ooOOo o0ooooo2 = this.f30637OooOO0O;
        if (o0ooooo2 != null) {
            o0ooooo2.OooO0OO(t, o000000o2);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList, java.util.List<o00O0Oo.o0OoOo0>] */
    public final List<o0OoOo0> OooO0oO() {
        if (this.f30636OooOO0 == null) {
            this.f30636OooOO0 = new ArrayList();
            for (int i = 0; i < this.f30635OooO0oo.size(); i++) {
                OooOO0 oooOO1 = this.f30635OooO0oo.get(i);
                if (oooOO1 instanceof o0OoOo0) {
                    this.f30636OooOO0.add((o0OoOo0) oooOO1);
                }
            }
        }
        return this.f30636OooOO0;
    }

    @Override // p118o00O0Oo.OooOOO0
    public final void OooO0oo(Canvas canvas, Matrix matrix, int i) {
        boolean z;
        if (this.f30634OooO0oO) {
            return;
        }
        this.f30630OooO0OO.set(matrix);
        o0ooOOo o0ooooo2 = this.f30637OooOO0O;
        if (o0ooooo2 != null) {
            this.f30630OooO0OO.preConcat(o0ooooo2.OooO0o0());
            p120o00O0OoO.OooOO0O<Integer, Integer> oooOO0O = this.f30637OooOO0O.f30811OooOO0;
            i = (int) (((((oooOO0O == null ? 100 : oooOO0O.OooO0o().intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        boolean z2 = false;
        if (this.f30627OooO.f10000OooooOO) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i2 >= this.f30635OooO0oo.size()) {
                    z = false;
                    break;
                } else {
                    if ((this.f30635OooO0oo.get(i2) instanceof OooOOO0) && (i3 = i3 + 1) >= 2) {
                        z = true;
                        break;
                    }
                    i2++;
                }
            }
            if (z && i != 255) {
                z2 = true;
            }
        }
        if (z2) {
            this.f30629OooO0O0.set(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            OooO0o(this.f30629OooO0O0, this.f30630OooO0OO, true);
            this.f30628OooO00o.setAlpha(i);
            o000O0Oo.OooO0o(canvas, this.f30629OooO0O0, this.f30628OooO00o, 31);
        }
        if (z2) {
            i = KotlinVersion.MAX_COMPONENT_VALUE;
        }
        for (int size = this.f30635OooO0oo.size() - 1; size >= 0; size--) {
            OooOO0 oooOO1 = this.f30635OooO0oo.get(size);
            if (oooOO1 instanceof OooOOO0) {
                ((OooOOO0) oooOO1).OooO0oo(canvas, this.f30630OooO0OO, i);
            }
        }
        if (z2) {
            canvas.restore();
        }
    }

    @Override // p118o00O0Oo.OooOO0
    public final String getName() {
        return this.f30632OooO0o;
    }

    public OooOO0O(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.OooO00o oooO00o, String str, boolean z, List<OooOO0> list, @Nullable o00O0O o00o0o2) {
        this.f30628OooO00o = new OooO00o();
        this.f30629OooO0O0 = new RectF();
        this.f30630OooO0OO = new Matrix();
        this.f30631OooO0Oo = new Path();
        this.f30633OooO0o0 = new RectF();
        this.f30632OooO0o = str;
        this.f30627OooO = lottieDrawable;
        this.f30634OooO0oO = z;
        this.f30635OooO0oo = list;
        if (o00o0o2 != null) {
            o0ooOOo o0ooooo2 = new o0ooOOo(o00o0o2);
            this.f30637OooOO0O = o0ooooo2;
            o0ooooo2.OooO00o(oooO00o);
            this.f30637OooOO0O.OooO0O0(this);
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            OooOO0 oooOO1 = list.get(size);
            if (oooOO1 instanceof Oooo000) {
                arrayList.add((Oooo000) oooOO1);
            }
        }
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return;
            } else {
                ((Oooo000) arrayList.get(size2)).OooO0oO(list.listIterator(list.size()));
            }
        }
    }
}
