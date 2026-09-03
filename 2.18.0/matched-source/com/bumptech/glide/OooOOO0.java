package com.bumptech.glide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import android.widget.ImageView;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.request.RequestCoordinator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ConcurrentMap;
import p215o00oO0.o00O0OOO;
import p215o00oO0.oo0oOO0;
import p218o00oO00o.o000000;
import p232o00oOo0o.o000000O;
import p235o00oOoOO.oOO0OO;
import p235o00oOoOO.oOO0OO0O;
import p235o00oOoOO.oOO0OOO;
import p235o00oOoOO.oOO0Oo00;
import p235o00oOoOO.ooooO0O0;
import p236o00oOoOo.oOOO000o;
import p236o00oOoOo.oOOO00Oo;
import p236o00oOoOo.oOOOOo0O;
import p236o00oOoOo.oOOOoo00;
import p240o00oOooo.b;
import p240o00oOooo.c;
import p240o00oOooo.e;
import p244o00oo00O.o000O000;

/* JADX INFO: loaded from: classes.dex */
public class OooOOO0<TranscodeType> extends oOO0OO0O<OooOOO0<TranscodeType>> {

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public final Context f12428o00o0O;

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    @NonNull
    public OooOOOO<?, ? super TranscodeType> f12429o00oO0O;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public final OooO f12430o00oO0o;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public final OooOOO f12431o00ooo;

    /* JADX INFO: renamed from: o0OO00O, reason: collision with root package name */
    public boolean f12432o0OO00O;

    /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
    @Nullable
    public OooOOO0<TranscodeType> f12433o0OOO0o;

    /* JADX INFO: renamed from: o0Oo0oo, reason: collision with root package name */
    public boolean f12434o0Oo0oo = true;

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    @Nullable
    public Object f12435o0ooOO0;

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    @Nullable
    public List<oOO0OOO<TranscodeType>> f12436o0ooOOo;

    /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
    @Nullable
    public OooOOO0<TranscodeType> f12437o0ooOoO;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public final Class<TranscodeType> f12438oo000o;

    /* JADX INFO: renamed from: oo0o0Oo, reason: collision with root package name */
    public boolean f12439oo0o0Oo;

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f12440OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final /* synthetic */ int[] f12441OooO0O0;

        static {
            int[] iArr = new int[Priority.values().length];
            f12441OooO0O0 = iArr;
            try {
                iArr[Priority.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12441OooO0O0[Priority.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12441OooO0O0[Priority.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12441OooO0O0[Priority.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f12440OooO00o = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12440OooO00o[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12440OooO00o[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f12440OooO00o[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f12440OooO00o[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f12440OooO00o[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f12440OooO00o[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f12440OooO00o[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
        new oOO0Oo00().OooOO0(o00O0OOO.f33490OooO0O0).OooOo(Priority.LOW).OooOoo0(true);
    }

    @SuppressLint({"CheckResult"})
    public OooOOO0(@NonNull OooO0OO oooO0OO, OooOOO oooOOO, Class<TranscodeType> cls, Context context) {
        oOO0Oo00 ooo0oo00;
        this.f12431o00ooo = oooOOO;
        this.f12438oo000o = cls;
        this.f12428o00o0O = context;
        OooO oooO = oooOOO.f12415Oooo.f12390OoooO0O;
        OooOOOO oooOOOO = oooO.f12379OooO0o.get(cls);
        if (oooOOOO == null) {
            for (Map.Entry<Class<?>, OooOOOO<?, ?>> entry : oooO.f12379OooO0o.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    oooOOOO = (OooOOOO) entry.getValue();
                }
            }
        }
        this.f12429o00oO0O = oooOOOO == null ? OooO.f12373OooOO0O : oooOOOO;
        this.f12430o00oO0o = oooO0OO.f12390OoooO0O;
        Iterator<oOO0OOO<Object>> it = oooOOO.f12422OoooOOo.iterator();
        while (it.hasNext()) {
            Oooo00o((oOO0OOO) it.next());
        }
        synchronized (oooOOO) {
            ooo0oo00 = oooOOO.f12423OoooOo0;
        }
        OooO0OO(ooo0oo00);
    }

    @NonNull
    @CheckResult
    public OooOOO0<TranscodeType> Oooo(@Nullable Uri uri) {
        return o000oOoO(uri);
    }

    @Override // p235o00oOoOO.oOO0OO0O
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: Oooo0, reason: merged with bridge method [inline-methods] */
    public OooOOO0<TranscodeType> OooO0OO(@NonNull oOO0OO0O<?> ooo0oo0o) {
        Objects.requireNonNull(ooo0oo0o, "Argument must not be null");
        return (OooOOO0) super.OooO0OO(ooo0oo0o);
    }

    @NonNull
    @CheckResult
    public OooOOO0<TranscodeType> Oooo00o(@Nullable oOO0OOO<TranscodeType> ooo0ooo) {
        if (this.f34006o0OoOo0) {
            return OooO0oO().Oooo00o(ooo0ooo);
        }
        if (ooo0ooo != null) {
            if (this.f12436o0ooOOo == null) {
                this.f12436o0ooOOo = new ArrayList();
            }
            this.f12436o0ooOOo.add(ooo0ooo);
        }
        OooOoO0();
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0063  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e0  */
    /* JADX WARN: Multi-variable type inference failed */
    public final oOO0OO Oooo0O0(Object obj, oOOOoo00 oooooo00, @Nullable RequestCoordinator requestCoordinator, OooOOOO oooOOOO, Priority priority, int i, int i2, oOO0OO0O ooo0oo0o) {
        com.bumptech.glide.request.OooO00o oooO00o;
        RequestCoordinator oooO00o2;
        oOO0OO ooo0ooOoooOOO;
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.f12433o0OOO0o != null) {
            oooO00o2 = new com.bumptech.glide.request.OooO00o(obj, requestCoordinator);
            oooO00o = oooO00o2;
        } else {
            oooO00o = 0;
            oooO00o2 = requestCoordinator;
        }
        OooOOO0<TranscodeType> oooOOO0 = this.f12437o0ooOoO;
        if (oooOOO0 == null) {
            ooo0ooOoooOOO = OoooOOO(obj, oooooo00, ooo0oo0o, oooO00o2, oooOOOO, priority, i, i2);
        } else {
            if (this.f12439oo0o0Oo) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            OooOOOO oooOOOO2 = oooOOO0.f12434o0Oo0oo ? oooOOOO : oooOOO0.f12429o00oO0O;
            Priority priorityOooo0o0 = oOO0OO0O.OooOOOO(oooOOO0.f33982Oooo, 8) ? this.f12437o0ooOoO.f33986OoooO0O : Oooo0o0(priority);
            OooOOO0<TranscodeType> oooOOO1 = this.f12437o0ooOoO;
            int i7 = oooOOO1.f33991OoooOoO;
            int i8 = oooOOO1.f33990OoooOo0;
            if (o000O000.OooOO0(i, i2)) {
                OooOOO0<TranscodeType> oooOOO2 = this.f12437o0ooOoO;
                if (o000O000.OooOO0(oooOOO2.f33991OoooOoO, oooOOO2.f33990OoooOo0)) {
                    i5 = i8;
                    i6 = i7;
                } else {
                    i6 = ooo0oo0o.f33991OoooOoO;
                    i5 = ooo0oo0o.f33990OoooOo0;
                }
            } else {
                i5 = i8;
                i6 = i7;
            }
            com.bumptech.glide.request.OooO0O0 oooO0O0 = new com.bumptech.glide.request.OooO0O0(obj, oooO00o2);
            oOO0OO ooo0ooOoooOOO2 = OoooOOO(obj, oooooo00, ooo0oo0o, oooO0O0, oooOOOO, priority, i, i2);
            this.f12439oo0o0Oo = true;
            OooOOO0<TranscodeType> oooOOO3 = this.f12437o0ooOoO;
            oOO0OO ooo0ooOooo0O0 = oooOOO3.Oooo0O0(obj, oooooo00, oooO0O0, oooOOOO2, priorityOooo0o0, i6, i5, oooOOO3);
            this.f12439oo0o0Oo = false;
            oooO0O0.f12558OooO0OO = ooo0ooOoooOOO2;
            oooO0O0.f12559OooO0Oo = ooo0ooOooo0O0;
            ooo0ooOoooOOO = oooO0O0;
        }
        if (oooO00o == 0) {
            return ooo0ooOoooOOO;
        }
        OooOOO0<TranscodeType> oooOOO4 = this.f12433o0OOO0o;
        int i9 = oooOOO4.f33991OoooOoO;
        int i10 = oooOOO4.f33990OoooOo0;
        if (o000O000.OooOO0(i, i2)) {
            OooOOO0<TranscodeType> oooOOO5 = this.f12433o0OOO0o;
            if (o000O000.OooOO0(oooOOO5.f33991OoooOoO, oooOOO5.f33990OoooOo0)) {
                i3 = i10;
                i4 = i9;
            } else {
                i4 = ooo0oo0o.f33991OoooOoO;
                i3 = ooo0oo0o.f33990OoooOo0;
            }
        } else {
            i3 = i10;
            i4 = i9;
        }
        OooOOO0<TranscodeType> oooOOO6 = this.f12433o0OOO0o;
        oOO0OO ooo0ooOooo0O1 = oooOOO6.Oooo0O0(obj, oooooo00, oooO00o, oooOOO6.f12429o00oO0O, oooOOO6.f33986OoooO0O, i4, i3, oooOOO6);
        oooO00o.f12552OooO0OO = ooo0ooOoooOOO;
        oooO00o.f12553OooO0Oo = ooo0ooOooo0O1;
        return oooO00o;
    }

    @Override // p235o00oOoOO.oOO0OO0O
    @CheckResult
    /* JADX INFO: renamed from: Oooo0OO, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public OooOOO0<TranscodeType> clone() {
        OooOOO0<TranscodeType> oooOOO0 = (OooOOO0) super.OooO0oO();
        oooOOO0.f12429o00oO0O = oooOOO0.f12429o00oO0O.OooO0OO();
        if (oooOOO0.f12436o0ooOOo != null) {
            oooOOO0.f12436o0ooOOo = new ArrayList(oooOOO0.f12436o0ooOOo);
        }
        OooOOO0<TranscodeType> oooOOO1 = oooOOO0.f12437o0ooOoO;
        if (oooOOO1 != null) {
            oooOOO0.f12437o0ooOoO = oooOOO1.OooO0oO();
        }
        OooOOO0<TranscodeType> oooOOO2 = oooOOO0.f12433o0OOO0o;
        if (oooOOO2 != null) {
            oooOOO0.f12433o0OOO0o = oooOOO2.OooO0oO();
        }
        return oooOOO0;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList, java.util.List<o00oOoOO.oOO0OO>] */
    public final oOOOoo00 Oooo0o(@NonNull oOOOoo00 oooooo00, oOO0OO0O ooo0oo0o) {
        Objects.requireNonNull(oooooo00, "Argument must not be null");
        if (!this.f12432o0OO00O) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        oOO0OO ooo0ooOooo0O0 = Oooo0O0(new Object(), oooooo00, null, this.f12429o00oO0O, ooo0oo0o.f33986OoooO0O, ooo0oo0o.f33991OoooOoO, ooo0oo0o.f33990OoooOo0, ooo0oo0o);
        oOO0OO request = oooooo00.getRequest();
        if (ooo0ooOooo0O0.OooOO0O(request)) {
            if (!(!ooo0oo0o.f33989OoooOOo && request.OooOO0())) {
                Objects.requireNonNull(request, "Argument must not be null");
                if (!request.isRunning()) {
                    request.OooO0oo();
                }
                return oooooo00;
            }
        }
        this.f12431o00ooo.OooO0o0(oooooo00);
        oooooo00.setRequest(ooo0ooOooo0O0);
        OooOOO oooOOO = this.f12431o00ooo;
        synchronized (oooOOO) {
            oooOOO.f12420OoooOO0.f33943Oooo.add(oooooo00);
            o000000O o000000o2 = oooOOO.f12419OoooO0O;
            o000000o2.f33940OooO00o.add(ooo0ooOooo0O0);
            if (o000000o2.f33942OooO0OO) {
                ooo0ooOooo0O0.clear();
                if (Log.isLoggable("RequestTracker", 2)) {
                    Log.v("RequestTracker", "Paused, delaying request");
                }
                o000000o2.f33941OooO0O0.add(ooo0ooOooo0O0);
            } else {
                ooo0ooOooo0O0.OooO0oo();
            }
        }
        return oooooo00;
    }

    @NonNull
    public final Priority Oooo0o0(@NonNull Priority priority) {
        int i = OooO00o.f12441OooO0O0[priority.ordinal()];
        if (i == 1) {
            return Priority.NORMAL;
        }
        if (i == 2) {
            return Priority.HIGH;
        }
        if (i == 3 || i == 4) {
            return Priority.IMMEDIATE;
        }
        StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("unknown priority: ");
        sbOooO0O0.append(this.f33986OoooO0O);
        throw new IllegalArgumentException(sbOooO0O0.toString());
    }

    @NonNull
    public final oOOOOo0O<ImageView, TranscodeType> Oooo0oO(@NonNull ImageView imageView) {
        oOO0OO0O ooo0oo0oOooOOo0;
        oOOOOo0O<ImageView, TranscodeType> oooo00oo;
        o000O000.OooO00o();
        Objects.requireNonNull(imageView, "Argument must not be null");
        if (!oOO0OO0O.OooOOOO(this.f33982Oooo, RecyclerView.oo0o0Oo.FLAG_MOVED) && this.f33994Ooooo0o && imageView.getScaleType() != null) {
            switch (OooO00o.f12440OooO00o[imageView.getScaleType().ordinal()]) {
                case 1:
                    ooo0oo0oOooOOo0 = OooO0oO().OooOOo0();
                    break;
                case 2:
                    ooo0oo0oOooOOo0 = OooO0oO().OooOOo();
                    break;
                case 3:
                case 4:
                case 5:
                    ooo0oo0oOooOOo0 = OooO0oO().OooOOoo();
                    break;
                case 6:
                    ooo0oo0oOooOOo0 = OooO0oO().OooOOo();
                    break;
                default:
                    ooo0oo0oOooOOo0 = this;
                    break;
            }
        } else {
            ooo0oo0oOooOOo0 = this;
        }
        OooO oooO = this.f12430o00oO0o;
        Class<TranscodeType> cls = this.f12438oo000o;
        Objects.requireNonNull(oooO.f12377OooO0OO);
        if (Bitmap.class.equals(cls)) {
            oooo00oo = new oOOO000o(imageView);
        } else {
            if (!Drawable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
            }
            oooo00oo = new oOOO00Oo(imageView);
        }
        Oooo0o(oooo00oo, ooo0oo0oOooOOo0);
        return oooo00oo;
    }

    @NonNull
    @CheckResult
    public OooOOO0 Oooo0oo() {
        return o000oOoO(null).OooO0OO(oOO0Oo00.Oooo00o(o00O0OOO.f33489OooO00o));
    }

    @NonNull
    @CheckResult
    public OooOOO0<TranscodeType> OoooO(@Nullable String str) {
        return o000oOoO(str);
    }

    @NonNull
    @CheckResult
    public OooOOO0<TranscodeType> OoooO0(@Nullable Object obj) {
        return o000oOoO(obj);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @NonNull
    @CheckResult
    public OooOOO0<TranscodeType> OoooO00(@Nullable @DrawableRes @RawRes Integer num) {
        PackageInfo packageInfo;
        OooOOO0<TranscodeType> oooOOO0O000oOoO = o000oOoO(num);
        Context context = this.f12428o00o0O;
        ConcurrentMap<String, o000000> concurrentMap = c.f34132OooO00o;
        String packageName = context.getPackageName();
        o000000 o000000VarPutIfAbsent = c.f34132OooO00o.get(packageName);
        if (o000000VarPutIfAbsent == null) {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException e) {
                StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("Cannot resolve info for");
                sbOooO0O0.append(context.getPackageName());
                Log.e("AppVersionSignature", sbOooO0O0.toString(), e);
                packageInfo = null;
            }
            e eVar = new e(packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString());
            o000000VarPutIfAbsent = c.f34132OooO00o.putIfAbsent(packageName, eVar);
            if (o000000VarPutIfAbsent == null) {
                o000000VarPutIfAbsent = eVar;
            }
        }
        return oooOOO0O000oOoO.OooO0OO(new oOO0Oo00().OooOoOO(new b(context.getResources().getConfiguration().uiMode & 48, o000000VarPutIfAbsent)));
    }

    @NonNull
    @CheckResult
    public OooOOO0 OoooOO0() {
        return o000oOoO(null);
    }

    public final oOO0OO OoooOOO(Object obj, oOOOoo00 oooooo00, oOO0OO0O ooo0oo0o, RequestCoordinator requestCoordinator, OooOOOO oooOOOO, Priority priority, int i, int i2) {
        Context context = this.f12428o00o0O;
        OooO oooO = this.f12430o00oO0o;
        Object obj2 = this.f12435o0ooOO0;
        Class<TranscodeType> cls = this.f12438oo000o;
        List<oOO0OOO<TranscodeType>> list = this.f12436o0ooOOo;
        oo0oOO0 oo0ooo0 = oooO.f12381OooO0oO;
        Objects.requireNonNull(oooOOOO);
        return new ooooO0O0(context, oooO, obj, obj2, cls, ooo0oo0o, i, i2, priority, oooooo00, list, requestCoordinator, oo0ooo0);
    }

    @NonNull
    @CheckResult
    public OooOOO0<TranscodeType> OoooOOo(@Nullable OooOOO0<TranscodeType> oooOOO0) {
        if (this.f34006o0OoOo0) {
            return OooO0oO().OoooOOo(oooOOO0);
        }
        this.f12437o0ooOoO = oooOOO0;
        OooOoO0();
        return this;
    }

    @NonNull
    public final OooOOO0<TranscodeType> o000oOoO(@Nullable Object obj) {
        if (this.f34006o0OoOo0) {
            return OooO0oO().o000oOoO(obj);
        }
        this.f12435o0ooOO0 = obj;
        this.f12432o0OO00O = true;
        OooOoO0();
        return this;
    }
}
