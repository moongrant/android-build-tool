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
import p214o00oO0.o00O;
import p214o00oO0.o00OO000;
import p217o00oO00o.o000000;
import p231o00oOo0o.o000000O;
import p234o00oOoOO.oOO0O0;
import p234o00oOoOO.oOO0O0O;
import p234o00oOoOO.oOO0O0O0;
import p234o00oOoOO.oOO0OO0O;
import p234o00oOoOO.oOO0OOO;
import p235o00oOoOo.oOO;
import p235o00oOoOo.oOO0OoO0;
import p235o00oOoOo.oOOO0O0o;
import p235o00oOoOo.oOOO0OO0;
import p239o00oOooo.O0OO00;
import p239o00oOooo.Oo0000;
import p239o00oOooo.b;
import p243o00oo00O.o000O000;

/* JADX INFO: loaded from: classes.dex */
public class OooOOO0<TranscodeType> extends oOO0O0<OooOOO0<TranscodeType>> {

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public final Context f12413o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public final OooOOO f12414o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public final Class<TranscodeType> f12415o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public final OooO f12416o00o0O;

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    @Nullable
    public OooOOO0<TranscodeType> f12417o00oO0O;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    @Nullable
    public List<oOO0O0O<TranscodeType>> f12418o00oO0o;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    @NonNull
    public OooOOOO<?, ? super TranscodeType> f12419o00ooo;

    /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
    public boolean f12420o0OOO0o;

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    @Nullable
    public OooOOO0<TranscodeType> f12421o0ooOO0;

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    public boolean f12422o0ooOOo = true;

    /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
    public boolean f12423o0ooOoO;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    @Nullable
    public Object f12424oo000o;

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f12425OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final /* synthetic */ int[] f12426OooO0O0;

        static {
            int[] iArr = new int[Priority.values().length];
            f12426OooO0O0 = iArr;
            try {
                iArr[Priority.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12426OooO0O0[Priority.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12426OooO0O0[Priority.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12426OooO0O0[Priority.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f12425OooO00o = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12425OooO00o[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12425OooO00o[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f12425OooO00o[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f12425OooO00o[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f12425OooO00o[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f12425OooO00o[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f12425OooO00o[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
        new oOO0OO0O().OooOO0(o00O.f33388OooO0O0).OooOo(Priority.LOW).OooOoo0(true);
    }

    @SuppressLint({"CheckResult"})
    public OooOOO0(@NonNull OooO0OO oooO0OO, OooOOO oooOOO, Class<TranscodeType> cls, Context context) {
        oOO0OO0O ooo0oo0o;
        this.f12414o00Oo0 = oooOOO;
        this.f12415o00Ooo = cls;
        this.f12413o00O0O = context;
        OooO oooO = oooOOO.f12401Oooo0o.f12371Oooo;
        OooOOOO oooOOOO = oooO.f12364OooO0o.get(cls);
        if (oooOOOO == null) {
            for (Map.Entry<Class<?>, OooOOOO<?, ?>> entry : oooO.f12364OooO0o.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    oooOOOO = (OooOOOO) entry.getValue();
                }
            }
        }
        this.f12419o00ooo = oooOOOO == null ? OooO.f12358OooOO0O : oooOOOO;
        this.f12416o00o0O = oooO0OO.f12371Oooo;
        Iterator<oOO0O0O<Object>> it = oooOOO.f12408OoooOO0.iterator();
        while (it.hasNext()) {
            Oooo00o((oOO0O0O) it.next());
        }
        synchronized (oooOOO) {
            ooo0oo0o = oooOOO.f12409o000oOoO;
        }
        OooO0OO(ooo0oo0o);
    }

    @NonNull
    @CheckResult
    public OooOOO0<TranscodeType> Oooo(@Nullable Uri uri) {
        return o000oOoO(uri);
    }

    @Override // p234o00oOoOO.oOO0O0
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: Oooo0, reason: merged with bridge method [inline-methods] */
    public OooOOO0<TranscodeType> OooO0OO(@NonNull oOO0O0<?> ooo0o0) {
        Objects.requireNonNull(ooo0o0, "Argument must not be null");
        return (OooOOO0) super.OooO0OO(ooo0o0);
    }

    @NonNull
    @CheckResult
    public OooOOO0<TranscodeType> Oooo00o(@Nullable oOO0O0O<TranscodeType> ooo0o0o) {
        if (this.f33979Oooooo) {
            return OooO0oO().Oooo00o(ooo0o0o);
        }
        if (ooo0o0o != null) {
            if (this.f12418o00oO0o == null) {
                this.f12418o00oO0o = new ArrayList();
            }
            this.f12418o00oO0o.add(ooo0o0o);
        }
        OooOoO0();
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0063  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e0  */
    /* JADX WARN: Multi-variable type inference failed */
    public final oOO0O0O0 Oooo0O0(Object obj, oOOO0O0o oooo0o0o, @Nullable RequestCoordinator requestCoordinator, OooOOOO oooOOOO, Priority priority, int i, int i2, oOO0O0 ooo0o0) {
        com.bumptech.glide.request.OooO00o oooO00o;
        RequestCoordinator oooO00o2;
        oOO0O0O0 ooo0o0o0OoooOOO;
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.f12421o0ooOO0 != null) {
            oooO00o2 = new com.bumptech.glide.request.OooO00o(obj, requestCoordinator);
            oooO00o = oooO00o2;
        } else {
            oooO00o = 0;
            oooO00o2 = requestCoordinator;
        }
        OooOOO0<TranscodeType> oooOOO0 = this.f12417o00oO0O;
        if (oooOOO0 == null) {
            ooo0o0o0OoooOOO = OoooOOO(obj, oooo0o0o, ooo0o0, oooO00o2, oooOOOO, priority, i, i2);
        } else {
            if (this.f12420o0OOO0o) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            OooOOOO oooOOOO2 = oooOOO0.f12422o0ooOOo ? oooOOOO : oooOOO0.f12419o00ooo;
            Priority priorityOooo0o0 = oOO0O0.OooOOOO(oooOOO0.f33961Oooo0o, 8) ? this.f12417o00oO0O.f33960Oooo : Oooo0o0(priority);
            OooOOO0<TranscodeType> oooOOO1 = this.f12417o00oO0O;
            int i7 = oooOOO1.f33969OoooOOO;
            int i8 = oooOOO1.f33983o000oOoO;
            if (o000O000.OooOO0(i, i2)) {
                OooOOO0<TranscodeType> oooOOO2 = this.f12417o00oO0O;
                if (o000O000.OooOO0(oooOOO2.f33969OoooOOO, oooOOO2.f33983o000oOoO)) {
                    i5 = i8;
                    i6 = i7;
                } else {
                    i6 = ooo0o0.f33969OoooOOO;
                    i5 = ooo0o0.f33983o000oOoO;
                }
            } else {
                i5 = i8;
                i6 = i7;
            }
            com.bumptech.glide.request.OooO0O0 oooO0O0 = new com.bumptech.glide.request.OooO0O0(obj, oooO00o2);
            oOO0O0O0 ooo0o0o0OoooOOO2 = OoooOOO(obj, oooo0o0o, ooo0o0, oooO0O0, oooOOOO, priority, i, i2);
            this.f12420o0OOO0o = true;
            OooOOO0<TranscodeType> oooOOO3 = this.f12417o00oO0O;
            oOO0O0O0 ooo0o0o0Oooo0O0 = oooOOO3.Oooo0O0(obj, oooo0o0o, oooO0O0, oooOOOO2, priorityOooo0o0, i6, i5, oooOOO3);
            this.f12420o0OOO0o = false;
            oooO0O0.f12543OooO0OO = ooo0o0o0OoooOOO2;
            oooO0O0.f12544OooO0Oo = ooo0o0o0Oooo0O0;
            ooo0o0o0OoooOOO = oooO0O0;
        }
        if (oooO00o == 0) {
            return ooo0o0o0OoooOOO;
        }
        OooOOO0<TranscodeType> oooOOO4 = this.f12421o0ooOO0;
        int i9 = oooOOO4.f33969OoooOOO;
        int i10 = oooOOO4.f33983o000oOoO;
        if (o000O000.OooOO0(i, i2)) {
            OooOOO0<TranscodeType> oooOOO5 = this.f12421o0ooOO0;
            if (o000O000.OooOO0(oooOOO5.f33969OoooOOO, oooOOO5.f33983o000oOoO)) {
                i3 = i10;
                i4 = i9;
            } else {
                i4 = ooo0o0.f33969OoooOOO;
                i3 = ooo0o0.f33983o000oOoO;
            }
        } else {
            i3 = i10;
            i4 = i9;
        }
        OooOOO0<TranscodeType> oooOOO6 = this.f12421o0ooOO0;
        oOO0O0O0 ooo0o0o0Oooo0O1 = oooOOO6.Oooo0O0(obj, oooo0o0o, oooO00o, oooOOO6.f12419o00ooo, oooOOO6.f33960Oooo, i4, i3, oooOOO6);
        oooO00o.f12537OooO0OO = ooo0o0o0OoooOOO;
        oooO00o.f12538OooO0Oo = ooo0o0o0Oooo0O1;
        return oooO00o;
    }

    @Override // p234o00oOoOO.oOO0O0
    @CheckResult
    /* JADX INFO: renamed from: Oooo0OO, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public OooOOO0<TranscodeType> clone() {
        OooOOO0<TranscodeType> oooOOO0 = (OooOOO0) super.OooO0oO();
        oooOOO0.f12419o00ooo = oooOOO0.f12419o00ooo.OooO0OO();
        if (oooOOO0.f12418o00oO0o != null) {
            oooOOO0.f12418o00oO0o = new ArrayList(oooOOO0.f12418o00oO0o);
        }
        OooOOO0<TranscodeType> oooOOO1 = oooOOO0.f12417o00oO0O;
        if (oooOOO1 != null) {
            oooOOO0.f12417o00oO0O = oooOOO1.OooO0oO();
        }
        OooOOO0<TranscodeType> oooOOO2 = oooOOO0.f12421o0ooOO0;
        if (oooOOO2 != null) {
            oooOOO0.f12421o0ooOO0 = oooOOO2.OooO0oO();
        }
        return oooOOO0;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList, java.util.List<o00oOoOO.oOO0O0O0>] */
    public final oOOO0O0o Oooo0o(@NonNull oOOO0O0o oooo0o0o, oOO0O0 ooo0o0) {
        Objects.requireNonNull(oooo0o0o, "Argument must not be null");
        if (!this.f12423o0ooOoO) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        oOO0O0O0 ooo0o0o0Oooo0O0 = Oooo0O0(new Object(), oooo0o0o, null, this.f12419o00ooo, ooo0o0.f33960Oooo, ooo0o0.f33969OoooOOO, ooo0o0.f33983o000oOoO, ooo0o0);
        oOO0O0O0 request = oooo0o0o.getRequest();
        if (ooo0o0o0Oooo0O0.OooOO0O(request)) {
            if (!(!ooo0o0.f33968OoooOO0 && request.OooOO0())) {
                Objects.requireNonNull(request, "Argument must not be null");
                if (!request.isRunning()) {
                    request.OooO0oo();
                }
                return oooo0o0o;
            }
        }
        this.f12414o00Oo0.OooO0o0(oooo0o0o);
        oooo0o0o.setRequest(ooo0o0o0Oooo0O0);
        OooOOO oooOOO = this.f12414o00Oo0;
        synchronized (oooOOO) {
            oooOOO.f12405OoooO0.f33921Oooo0o.add(oooo0o0o);
            o000000O o000000o2 = oooOOO.f12400Oooo;
            o000000o2.f33918OooO00o.add(ooo0o0o0Oooo0O0);
            if (o000000o2.f33920OooO0OO) {
                ooo0o0o0Oooo0O0.clear();
                if (Log.isLoggable("RequestTracker", 2)) {
                    Log.v("RequestTracker", "Paused, delaying request");
                }
                o000000o2.f33919OooO0O0.add(ooo0o0o0Oooo0O0);
            } else {
                ooo0o0o0Oooo0O0.OooO0oo();
            }
        }
        return oooo0o0o;
    }

    @NonNull
    public final Priority Oooo0o0(@NonNull Priority priority) {
        int i = OooO00o.f12426OooO0O0[priority.ordinal()];
        if (i == 1) {
            return Priority.NORMAL;
        }
        if (i == 2) {
            return Priority.HIGH;
        }
        if (i == 3 || i == 4) {
            return Priority.IMMEDIATE;
        }
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("unknown priority: ");
        sbOooO0o0.append(this.f33960Oooo);
        throw new IllegalArgumentException(sbOooO0o0.toString());
    }

    @NonNull
    public final oOOO0OO0<ImageView, TranscodeType> Oooo0oO(@NonNull ImageView imageView) {
        oOO0O0 ooo0o0OooOOo0;
        oOOO0OO0<ImageView, TranscodeType> ooo;
        o000O000.OooO00o();
        Objects.requireNonNull(imageView, "Argument must not be null");
        if (!oOO0O0.OooOOOO(this.f33961Oooo0o, RecyclerView.oo0o0Oo.FLAG_MOVED) && this.f33972OoooOoO && imageView.getScaleType() != null) {
            switch (OooO00o.f12425OooO00o[imageView.getScaleType().ordinal()]) {
                case 1:
                    ooo0o0OooOOo0 = OooO0oO().OooOOo0();
                    break;
                case 2:
                    ooo0o0OooOOo0 = OooO0oO().OooOOo();
                    break;
                case 3:
                case 4:
                case 5:
                    ooo0o0OooOOo0 = OooO0oO().OooOOoo();
                    break;
                case 6:
                    ooo0o0OooOOo0 = OooO0oO().OooOOo();
                    break;
                default:
                    ooo0o0OooOOo0 = this;
                    break;
            }
        } else {
            ooo0o0OooOOo0 = this;
        }
        OooO oooO = this.f12416o00o0O;
        Class<TranscodeType> cls = this.f12415o00Ooo;
        Objects.requireNonNull(oooO.f12362OooO0OO);
        if (Bitmap.class.equals(cls)) {
            ooo = new oOO0OoO0(imageView);
        } else {
            if (!Drawable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
            }
            ooo = new oOO(imageView);
        }
        Oooo0o(ooo, ooo0o0OooOOo0);
        return ooo;
    }

    @NonNull
    @CheckResult
    public OooOOO0 Oooo0oo() {
        return o000oOoO(null).OooO0OO(oOO0OO0O.Oooo00o(o00O.f33387OooO00o));
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
        Context context = this.f12413o00O0O;
        ConcurrentMap<String, o000000> concurrentMap = Oo0000.f34110OooO00o;
        String packageName = context.getPackageName();
        o000000 o000000VarPutIfAbsent = Oo0000.f34110OooO00o.get(packageName);
        if (o000000VarPutIfAbsent == null) {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException e) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Cannot resolve info for");
                sbOooO0o0.append(context.getPackageName());
                Log.e("AppVersionSignature", sbOooO0o0.toString(), e);
                packageInfo = null;
            }
            b bVar = new b(packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString());
            o000000VarPutIfAbsent = Oo0000.f34110OooO00o.putIfAbsent(packageName, bVar);
            if (o000000VarPutIfAbsent == null) {
                o000000VarPutIfAbsent = bVar;
            }
        }
        return oooOOO0O000oOoO.OooO0OO(new oOO0OO0O().OooOoOO(new O0OO00(context.getResources().getConfiguration().uiMode & 48, o000000VarPutIfAbsent)));
    }

    @NonNull
    @CheckResult
    public OooOOO0 OoooOO0() {
        return o000oOoO(null);
    }

    public final oOO0O0O0 OoooOOO(Object obj, oOOO0O0o oooo0o0o, oOO0O0 ooo0o0, RequestCoordinator requestCoordinator, OooOOOO oooOOOO, Priority priority, int i, int i2) {
        Context context = this.f12413o00O0O;
        OooO oooO = this.f12416o00o0O;
        Object obj2 = this.f12424oo000o;
        Class<TranscodeType> cls = this.f12415o00Ooo;
        List<oOO0O0O<TranscodeType>> list = this.f12418o00oO0o;
        o00OO000 o00oo001 = oooO.f12366OooO0oO;
        Objects.requireNonNull(oooOOOO);
        return new oOO0OOO(context, oooO, obj, obj2, cls, ooo0o0, i, i2, priority, oooo0o0o, list, requestCoordinator, o00oo001);
    }

    @NonNull
    @CheckResult
    public OooOOO0<TranscodeType> OoooOOo(@Nullable OooOOO0<TranscodeType> oooOOO0) {
        if (this.f33979Oooooo) {
            return OooO0oO().OoooOOo(oooOOO0);
        }
        this.f12417o00oO0O = oooOOO0;
        OooOoO0();
        return this;
    }

    @NonNull
    public final OooOOO0<TranscodeType> o000oOoO(@Nullable Object obj) {
        if (this.f33979Oooooo) {
            return OooO0oO().o000oOoO(obj);
        }
        this.f12424oo000o = obj;
        this.f12423o0ooOoO = true;
        OooOoO0();
        return this;
    }
}
