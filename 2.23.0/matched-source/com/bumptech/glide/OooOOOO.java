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
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.manager.oo000o;
import com.bumptech.glide.request.RequestCoordinator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p126o00O0oOo.o000OOo;
import p127o00O0oo.oo0o0Oo;
import p532o0o0Oo.o000000O;
import p532o0o0Oo.o0000O00;
import p532o0o0Oo.o0000oo;

/* JADX INFO: loaded from: classes2.dex */
public class OooOOOO<TranscodeType> extends o00OO.OooO00o<OooOOOO<TranscodeType>> {

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final Context f9880OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final OooOo00 f9881OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    @Nullable
    public Object f9882Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final Class<TranscodeType> f9883Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final OooO f9884Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    @NonNull
    public OooOo<?, ? super TranscodeType> f9885Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    @Nullable
    public ArrayList f9886Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    @Nullable
    public OooOOOO<TranscodeType> f9887Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final boolean f9888Oooo0o = true;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    @Nullable
    public OooOOOO<TranscodeType> f9889Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public boolean f9890Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public boolean f9891Oooo0oo;

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f9892OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final /* synthetic */ int[] f9893OooO0O0;

        static {
            int[] iArr = new int[Priority.values().length];
            f9893OooO0O0 = iArr;
            try {
                iArr[Priority.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9893OooO0O0[Priority.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9893OooO0O0[Priority.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9893OooO0O0[Priority.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f9892OooO00o = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9892OooO00o[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9892OooO00o[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f9892OooO00o[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f9892OooO00o[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f9892OooO00o[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f9892OooO00o[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f9892OooO00o[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
        new o00OO.OooOO0().OooO(oo0o0Oo.f36939OooO0O0).OooOoO0(Priority.LOW).Oooo000(true);
    }

    @SuppressLint({"CheckResult"})
    public OooOOOO(@NonNull OooO0OO oooO0OO, OooOo00 oooOo00, Class<TranscodeType> cls, Context context) {
        o00OO.OooOO0 oooOO1;
        this.f9881OooOooo = oooOo00;
        this.f9883Oooo000 = cls;
        this.f9880OooOooO = context;
        Map<Class<?>, OooOo<?, ?>> map = oooOo00.f9898OooO0Oo.f9854OooO0oO.f9843OooO0o;
        OooOo value = map.get(cls);
        if (value == null) {
            for (Map.Entry<Class<?>, OooOo<?, ?>> entry : map.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    value = entry.getValue();
                }
            }
        }
        this.f9885Oooo00o = value == null ? OooO.f9837OooOO0O : value;
        this.f9884Oooo00O = oooO0OO.f9854OooO0oO;
        Iterator<o00OO.OooO<Object>> it = oooOo00.f9905OooOO0o.iterator();
        while (it.hasNext()) {
            Oooo0oO((o00OO.OooO) it.next());
        }
        synchronized (oooOo00) {
            oooOO1 = oooOo00.f9906OooOOO0;
        }
        OooO0O0(oooOO1);
    }

    public final OooOOOO<TranscodeType> Oooo(OooOOOO<TranscodeType> oooOOOO) {
        PackageInfo packageInfo;
        Context context = this.f9880OooOooO;
        OooOOOO<TranscodeType> oooOOOOOooo00O = oooOOOO.Oooo00O(context.getTheme());
        ConcurrentHashMap concurrentHashMap = o00OOO0O.OooO0O0.f37347OooO00o;
        String packageName = context.getPackageName();
        ConcurrentHashMap concurrentHashMap2 = o00OOO0O.OooO0O0.f37347OooO00o;
        o000OOo o000ooo2 = (o000OOo) concurrentHashMap2.get(packageName);
        if (o000ooo2 == null) {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("AppVersionSignature", "Cannot resolve info for" + context.getPackageName(), e);
                packageInfo = null;
            }
            o00OOO0O.OooO0o oooO0o = new o00OOO0O.OooO0o(packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString());
            o000ooo2 = (o000OOo) concurrentHashMap2.putIfAbsent(packageName, oooO0o);
            if (o000ooo2 == null) {
                o000ooo2 = oooO0o;
            }
        }
        return oooOOOOOooo00O.OooOooo(new o00OOO0O.OooO00o(context.getResources().getConfiguration().uiMode & 48, o000ooo2));
    }

    @NonNull
    @CheckResult
    public OooOOOO<TranscodeType> Oooo0oO(@Nullable o00OO.OooO<TranscodeType> oooO) {
        if (this.f37013OooOoO0) {
            return clone().Oooo0oO(oooO);
        }
        if (oooO != null) {
            if (this.f9886Oooo0O0 == null) {
                this.f9886Oooo0O0 = new ArrayList();
            }
            this.f9886Oooo0O0.add(oooO);
        }
        OooOoo0();
        return this;
    }

    @Override // o00OO.OooO00o
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: Oooo0oo, reason: merged with bridge method [inline-methods] */
    public OooOOOO<TranscodeType> OooO0O0(@NonNull o00OO.OooO00o<?> oooO00o) {
        o0000O00.OooO0O0(oooO00o);
        return (OooOOOO) super.OooO0O0(oooO00o);
    }

    public final void OoooO(@NonNull o00OOO00.OooOOO0 oooOOO0, @Nullable o00OO.OooO0o oooO0o, o00OO.OooO00o oooO00o, Executor executor) {
        o0000O00.OooO0O0(oooOOO0);
        if (!this.f9890Oooo0oO) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        Object obj = new Object();
        o00OO.OooO0OO oooO0OOOoooO00 = OoooO00(oooO00o.f37000OooOOO, oooO00o.f37001OooOOO0, oooO00o.f36995OooO0oO, this.f9885Oooo00o, oooO00o, null, oooO0o, oooOOO0, obj, executor);
        o00OO.OooO0OO oooO0OOOooO00o = oooOOO0.OooO00o();
        if (oooO0OOOoooO00.OooO0OO(oooO0OOOooO00o)) {
            if (!(!oooO00o.f36999OooOO0o && oooO0OOOooO00o.OooO0oo())) {
                o0000O00.OooO0O0(oooO0OOOooO00o);
                if (oooO0OOOooO00o.isRunning()) {
                    return;
                }
                oooO0OOOooO00o.OooOO0();
                return;
            }
        }
        this.f9881OooOooo.OooOOO0(oooOOO0);
        oooOOO0.OooO0Oo(oooO0OOOoooO00);
        OooOo00 oooOo00 = this.f9881OooOooo;
        synchronized (oooOo00) {
            oooOo00.f9897OooO.f10060OooO0Oo.add(oooOOO0);
            oo000o oo000oVar = oooOo00.f9901OooO0oO;
            oo000oVar.f10073OooO00o.add(oooO0OOOoooO00);
            if (oo000oVar.f10075OooO0OO) {
                oooO0OOOoooO00.clear();
                if (Log.isLoggable("RequestTracker", 2)) {
                    Log.v("RequestTracker", "Paused, delaying request");
                }
                oo000oVar.f10074OooO0O0.add(oooO0OOOoooO00);
            } else {
                oooO0OOOoooO00.OooOO0();
            }
        }
    }

    @Override // o00OO.OooO00o
    @CheckResult
    /* JADX INFO: renamed from: OoooO0, reason: merged with bridge method [inline-methods] */
    public OooOOOO<TranscodeType> clone() {
        OooOOOO<TranscodeType> oooOOOO = (OooOOOO) super.clone();
        oooOOOO.f9885Oooo00o = oooOOOO.f9885Oooo00o.clone();
        if (oooOOOO.f9886Oooo0O0 != null) {
            oooOOOO.f9886Oooo0O0 = new ArrayList(oooOOOO.f9886Oooo0O0);
        }
        OooOOOO<TranscodeType> oooOOOO2 = oooOOOO.f9887Oooo0OO;
        if (oooOOOO2 != null) {
            oooOOOO.f9887Oooo0OO = oooOOOO2.clone();
        }
        OooOOOO<TranscodeType> oooOOOO3 = oooOOOO.f9889Oooo0o0;
        if (oooOOOO3 != null) {
            oooOOOO.f9889Oooo0o0 = oooOOOO3.clone();
        }
        return oooOOOO;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0090  */
    /* JADX WARN: Code duplicated, block: B:48:0x0118  */
    /* JADX WARN: Multi-variable type inference failed */
    public final o00OO.OooO0OO OoooO00(int i, int i2, Priority priority, OooOo oooOo, o00OO.OooO00o oooO00o, @Nullable RequestCoordinator requestCoordinator, @Nullable o00OO.OooO0o oooO0o, o00OOO00.OooOOO0 oooOOO0, Object obj, Executor executor) {
        com.bumptech.glide.request.OooO00o oooO00o2;
        RequestCoordinator oooO00o3;
        o00OO.OooO0OO oooO0OOOoooo00;
        int i3;
        Priority priority2;
        int i4;
        int i5;
        if (this.f9889Oooo0o0 != null) {
            oooO00o3 = new com.bumptech.glide.request.OooO00o(obj, requestCoordinator);
            oooO00o2 = oooO00o3;
        } else {
            oooO00o2 = 0;
            oooO00o3 = requestCoordinator;
        }
        OooOOOO<TranscodeType> oooOOOO = this.f9887Oooo0OO;
        if (oooOOOO == null) {
            oooO0OOOoooo00 = Ooooo00(i, i2, priority, oooOo, oooO00o, oooO00o3, oooO0o, oooOOO0, obj, executor);
        } else {
            if (this.f9891Oooo0oo) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            OooOo oooOo2 = oooOOOO.f9888Oooo0o ? oooOo : oooOOOO.f9885Oooo00o;
            if (o00OO.OooO00o.OooOOOO(oooOOOO.f36992OooO0Oo, 8)) {
                priority2 = this.f9887Oooo0OO.f36995OooO0oO;
            } else {
                int i6 = OooO00o.f9893OooO0O0[priority.ordinal()];
                if (i6 == 1) {
                    priority2 = Priority.NORMAL;
                } else if (i6 == 2) {
                    priority2 = Priority.HIGH;
                } else {
                    if (i6 != 3 && i6 != 4) {
                        throw new IllegalArgumentException("unknown priority: " + this.f36995OooO0oO);
                    }
                    priority2 = Priority.IMMEDIATE;
                }
            }
            Priority priority3 = priority2;
            OooOOOO<TranscodeType> oooOOOO2 = this.f9887Oooo0OO;
            int i7 = oooOOOO2.f37000OooOOO;
            int i8 = oooOOOO2.f37001OooOOO0;
            if (o0000oo.OooO(i, i2)) {
                OooOOOO<TranscodeType> oooOOOO3 = this.f9887Oooo0OO;
                if (o0000oo.OooO(oooOOOO3.f37000OooOOO, oooOOOO3.f37001OooOOO0)) {
                    i4 = i8;
                    i5 = i7;
                } else {
                    i5 = oooO00o.f37000OooOOO;
                    i4 = oooO00o.f37001OooOOO0;
                }
            } else {
                i4 = i8;
                i5 = i7;
            }
            com.bumptech.glide.request.OooO0O0 oooO0O0 = new com.bumptech.glide.request.OooO0O0(obj, oooO00o3);
            o00OO.OooOOO0 oooOOO0Ooooo00 = Ooooo00(i, i2, priority, oooOo, oooO00o, oooO0O0, oooO0o, oooOOO0, obj, executor);
            this.f9891Oooo0oo = true;
            OooOOOO<TranscodeType> oooOOOO4 = this.f9887Oooo0OO;
            o00OO.OooO0OO oooO0OOOoooO00 = oooOOOO4.OoooO00(i5, i4, priority3, oooOo2, oooOOOO4, oooO0O0, oooO0o, oooOOO0, obj, executor);
            this.f9891Oooo0oo = false;
            oooO0O0.f10088OooO0OO = oooOOO0Ooooo00;
            oooO0O0.f10089OooO0Oo = oooO0OOOoooO00;
            oooO0OOOoooo00 = oooO0O0;
        }
        if (oooO00o2 == 0) {
            return oooO0OOOoooo00;
        }
        OooOOOO<TranscodeType> oooOOOO5 = this.f9889Oooo0o0;
        int i9 = oooOOOO5.f37000OooOOO;
        int i10 = oooOOOO5.f37001OooOOO0;
        if (o0000oo.OooO(i, i2)) {
            OooOOOO<TranscodeType> oooOOOO6 = this.f9889Oooo0o0;
            if (o0000oo.OooO(oooOOOO6.f37000OooOOO, oooOOOO6.f37001OooOOO0)) {
                i3 = i10;
            } else {
                int i11 = oooO00o.f37000OooOOO;
                i3 = oooO00o.f37001OooOOO0;
                i9 = i11;
            }
        } else {
            i3 = i10;
        }
        OooOOOO<TranscodeType> oooOOOO7 = this.f9889Oooo0o0;
        o00OO.OooO0OO oooO0OOOoooO01 = oooOOOO7.OoooO00(i9, i3, oooOOOO7.f36995OooO0oO, oooOOOO7.f9885Oooo00o, oooOOOO7, oooO00o2, oooO0o, oooOOO0, obj, executor);
        oooO00o2.f10082OooO0OO = oooO0OOOoooo00;
        oooO00o2.f10083OooO0Oo = oooO0OOOoooO01;
        return oooO00o2;
    }

    @NonNull
    public final void OoooO0O(@NonNull ImageView imageView) {
        o00OO.OooO00o oooO00oOooOOo;
        o00OOO00.OooOOO0 oooO0o;
        o0000oo.OooO00o();
        o0000O00.OooO0O0(imageView);
        if (!o00OO.OooO00o.OooOOOO(this.f36992OooO0Oo, 2048) && this.f37005OooOOo0 && imageView.getScaleType() != null) {
            switch (OooO00o.f9892OooO00o[imageView.getScaleType().ordinal()]) {
                case 1:
                    oooO00oOooOOo = clone().OooOOo();
                    break;
                case 2:
                    oooO00oOooOOo = clone().OooOOoo();
                    break;
                case 3:
                case 4:
                case 5:
                    oooO00oOooOOo = clone().OooOo00();
                    break;
                case 6:
                    oooO00oOooOOo = clone().OooOOoo();
                    break;
                default:
                    oooO00oOooOOo = this;
                    break;
            }
        } else {
            oooO00oOooOOo = this;
        }
        this.f9884Oooo00O.f9841OooO0OO.getClass();
        Class<TranscodeType> cls = this.f9883Oooo000;
        if (Bitmap.class.equals(cls)) {
            oooO0o = new o00OOO00.OooO0O0(imageView);
        } else {
            if (!Drawable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
            }
            oooO0o = new o00OOO00.OooO0o(imageView);
        }
        OoooO(oooO0o, null, oooO00oOooOOo, o000000O.f54561OooO00o);
    }

    @NonNull
    @CheckResult
    public OooOOOO OoooOO0() {
        return OoooOoo(null).OooO0O0(new o00OO.OooOO0().OooO(oo0o0Oo.f36938OooO00o));
    }

    @NonNull
    @CheckResult
    public OooOOOO OoooOOO(@Nullable GifDecoder gifDecoder) {
        return OoooOoo(gifDecoder);
    }

    @NonNull
    @CheckResult
    public OooOOOO<TranscodeType> OoooOOo(@Nullable @DrawableRes @RawRes Integer num) {
        return Oooo(OoooOoo(num));
    }

    @NonNull
    @CheckResult
    public OooOOOO<TranscodeType> OoooOo0(@Nullable String str) {
        return OoooOoo(str);
    }

    @NonNull
    @CheckResult
    public OooOOOO OoooOoO() {
        return OoooOoo(null);
    }

    @NonNull
    public final OooOOOO<TranscodeType> OoooOoo(@Nullable Object obj) {
        if (this.f37013OooOoO0) {
            return clone().OoooOoo(obj);
        }
        this.f9882Oooo0 = obj;
        this.f9890Oooo0oO = true;
        OooOoo0();
        return this;
    }

    public final o00OO.OooOOO0 Ooooo00(int i, int i2, Priority priority, OooOo oooOo, o00OO.OooO00o oooO00o, RequestCoordinator requestCoordinator, o00OO.OooO0o oooO0o, o00OOO00.OooOOO0 oooOOO0, Object obj, Executor executor) {
        Context context = this.f9880OooOooO;
        Object obj2 = this.f9882Oooo0;
        Class<TranscodeType> cls = this.f9883Oooo000;
        ArrayList arrayList = this.f9886Oooo0O0;
        OooO oooO = this.f9884Oooo00O;
        return new o00OO.OooOOO0(context, oooO, obj, obj2, cls, oooO00o, i, i2, priority, oooOOO0, oooO0o, arrayList, requestCoordinator, oooO.f9845OooO0oO, oooOo.f9894OooO0Oo, executor);
    }

    @NonNull
    @CheckResult
    public OooOOOO<TranscodeType> Ooooo0o(@Nullable OooOOOO<TranscodeType> oooOOOO) {
        if (this.f37013OooOoO0) {
            return clone().Ooooo0o(oooOOOO);
        }
        this.f9887Oooo0OO = oooOOOO;
        OooOoo0();
        return this;
    }

    @Override // o00OO.OooO00o
    public final boolean equals(Object obj) {
        if (obj instanceof OooOOOO) {
            OooOOOO oooOOOO = (OooOOOO) obj;
            if (super.equals(oooOOOO)) {
                if (Objects.equals(this.f9883Oooo000, oooOOOO.f9883Oooo000) && this.f9885Oooo00o.equals(oooOOOO.f9885Oooo00o) && Objects.equals(this.f9882Oooo0, oooOOOO.f9882Oooo0) && Objects.equals(this.f9886Oooo0O0, oooOOOO.f9886Oooo0O0) && Objects.equals(this.f9887Oooo0OO, oooOOOO.f9887Oooo0OO) && Objects.equals(this.f9889Oooo0o0, oooOOOO.f9889Oooo0o0) && this.f9888Oooo0o == oooOOOO.f9888Oooo0o && this.f9890Oooo0oO == oooOOOO.f9890Oooo0oO) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // o00OO.OooO00o
    public final int hashCode() {
        return o0000oo.OooO0oO(o0000oo.OooO0oO(o0000oo.OooO0o(o0000oo.OooO0o(o0000oo.OooO0o(o0000oo.OooO0o(o0000oo.OooO0o(o0000oo.OooO0o(o0000oo.OooO0o(super.hashCode(), this.f9883Oooo000), this.f9885Oooo00o), this.f9882Oooo0), this.f9886Oooo0O0), this.f9887Oooo0OO), this.f9889Oooo0o0), null), this.f9888Oooo0o), this.f9890Oooo0oO);
    }

    @NonNull
    @CheckResult
    public OooOOOO<TranscodeType> o000oOoO(@Nullable Uri uri) {
        OooOOOO<TranscodeType> OoooOoo2 = OoooOoo(uri);
        return (uri == null || !"android.resource".equals(uri.getScheme())) ? OoooOoo2 : Oooo(OoooOoo2);
    }
}
