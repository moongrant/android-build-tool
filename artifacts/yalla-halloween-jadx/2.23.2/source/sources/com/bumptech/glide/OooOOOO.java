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
import com.bumptech.glide.request.RequestCoordinator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p144o00Oo.o000O00O;
import p154o00Oo0oo.o0OOO0o;
import p170o00Ooo0o.Oooo0;
import p170o00Ooo0o.o000oOoO;
import p170o00Ooo0o.o00O0O;
import p170o00Ooo0o.o00Ooo;
import p170o00Ooo0o.o0OoOo0;
import p172o00OooO0.o000000O;
import p172o00OooO0.o00000OO;
import p172o00OooO0.o000OOo;
import p173o00OooOO.o00O00OO;
import p173o00OooOO.oOO00O;
import p173o00OooOO.oo00o;
import p174o00OooOo.o00O0OO0;
import p174o00OooOo.o00OO00O;
import p174o00OooOo.o00OO0O0;

/* JADX INFO: loaded from: classes2.dex */
public class OooOOOO<TranscodeType> extends p170o00Ooo0o.OooOo<OooOOOO<TranscodeType>> {

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final Context f12971OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final OooOo00 f12972OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    @Nullable
    public Object f12973Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final Class<TranscodeType> f12974Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final OooO f12975Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    @NonNull
    public OooOo<?, ? super TranscodeType> f12976Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    @Nullable
    public ArrayList f12977Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    @Nullable
    public OooOOOO<TranscodeType> f12978Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final boolean f12979Oooo0o = true;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    @Nullable
    public OooOOOO<TranscodeType> f12980Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public boolean f12981Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public boolean f12982Oooo0oo;

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f12983OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final /* synthetic */ int[] f12984OooO0O0;

        static {
            int[] iArr = new int[Priority.values().length];
            f12984OooO0O0 = iArr;
            try {
                iArr[Priority.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12984OooO0O0[Priority.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12984OooO0O0[Priority.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12984OooO0O0[Priority.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f12983OooO00o = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12983OooO00o[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12983OooO00o[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f12983OooO00o[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f12983OooO00o[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f12983OooO00o[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f12983OooO00o[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f12983OooO00o[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
        new o00O0O().OooO(o000O00O.f37589OooO0O0).OooOoO0(Priority.LOW).Oooo000(true);
    }

    @SuppressLint({"CheckResult"})
    public OooOOOO(@NonNull OooO0OO oooO0OO, OooOo00 oooOo00, Class<TranscodeType> cls, Context context) {
        o00O0O o00o0o2;
        this.f12972OooOooo = oooOo00;
        this.f12974Oooo000 = cls;
        this.f12971OooOooO = context;
        Map<Class<?>, OooOo<?, ?>> map = oooOo00.f12989OooO0Oo.f12945OooO0oO.f12934OooO0o;
        OooOo value = map.get(cls);
        if (value == null) {
            for (Map.Entry<Class<?>, OooOo<?, ?>> entry : map.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    value = entry.getValue();
                }
            }
        }
        this.f12976Oooo00o = value == null ? OooO.f12928OooOO0O : value;
        this.f12975Oooo00O = oooO0OO.f12945OooO0oO;
        Iterator<o0OoOo0<Object>> it = oooOo00.f12996OooOO0o.iterator();
        while (it.hasNext()) {
            Oooo0oO((o0OoOo0) it.next());
        }
        synchronized (oooOo00) {
            o00o0o2 = oooOo00.f12997OooOOO0;
        }
        OooO0O0(o00o0o2);
    }

    public final OooOOOO<TranscodeType> Oooo(OooOOOO<TranscodeType> oooOOOO) {
        PackageInfo packageInfo;
        Context context = this.f12971OooOooO;
        OooOOOO<TranscodeType> oooOOOOOooo00O = oooOOOO.Oooo00O(context.getTheme());
        ConcurrentHashMap concurrentHashMap = o00O00OO.f38326OooO00o;
        String packageName = context.getPackageName();
        ConcurrentHashMap concurrentHashMap2 = o00O00OO.f38326OooO00o;
        o0OOO0o o0ooo0o2 = (o0OOO0o) concurrentHashMap2.get(packageName);
        if (o0ooo0o2 == null) {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("AppVersionSignature", "Cannot resolve info for" + context.getPackageName(), e);
                packageInfo = null;
            }
            oo00o oo00oVar = new oo00o(packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString());
            o0ooo0o2 = (o0OOO0o) concurrentHashMap2.putIfAbsent(packageName, oo00oVar);
            if (o0ooo0o2 == null) {
                o0ooo0o2 = oo00oVar;
            }
        }
        return oooOOOOOooo00O.OooOooO(new oOO00O(context.getResources().getConfiguration().uiMode & 48, o0ooo0o2));
    }

    @NonNull
    @CheckResult
    public OooOOOO<TranscodeType> Oooo0oO(@Nullable o0OoOo0<TranscodeType> o0oooo1) {
        if (this.f38270OooOoO0) {
            return clone().Oooo0oO(o0oooo1);
        }
        if (o0oooo1 != null) {
            if (this.f12977Oooo0O0 == null) {
                this.f12977Oooo0O0 = new ArrayList();
            }
            this.f12977Oooo0O0.add(o0oooo1);
        }
        OooOoo0();
        return this;
    }

    @Override // p170o00Ooo0o.OooOo
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: Oooo0oo, reason: merged with bridge method [inline-methods] */
    public OooOOOO<TranscodeType> OooO0O0(@NonNull p170o00Ooo0o.OooOo<?> oooOo) {
        o00OO00O.OooO0O0(oooOo);
        return (OooOOOO) super.OooO0O0(oooOo);
    }

    public final void OoooO(@NonNull o00000OO o00000oo2, @Nullable o000oOoO o000oooo2, p170o00Ooo0o.OooOo oooOo, Executor executor) {
        o00OO00O.OooO0O0(o00000oo2);
        if (!this.f12981Oooo0oO) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        Object obj = new Object();
        Oooo0 oooo0OoooO00 = OoooO00(oooOo.f38257OooOOO, oooOo.f38258OooOOO0, oooOo.f38252OooO0oO, this.f12976Oooo00o, oooOo, null, o000oooo2, o00000oo2, obj, executor);
        Oooo0 oooo0OooO00o = o00000oo2.OooO00o();
        if (oooo0OoooO00.OooO0oO(oooo0OooO00o)) {
            if (!(!oooOo.f38256OooOO0o && oooo0OooO00o.OooO0Oo())) {
                o00OO00O.OooO0O0(oooo0OooO00o);
                if (oooo0OooO00o.isRunning()) {
                    return;
                }
                oooo0OooO00o.OooOO0();
                return;
            }
        }
        this.f12972OooOooo.OooOOO0(o00000oo2);
        o00000oo2.OooO(oooo0OoooO00);
        OooOo00 oooOo00 = this.f12972OooOooo;
        synchronized (oooOo00) {
            oooOo00.f12988OooO.f13156OooO0Oo.add(o00000oo2);
            com.bumptech.glide.manager.o0OoOo0 o0oooo1 = oooOo00.f12992OooO0oO;
            o0oooo1.f13153OooO00o.add(oooo0OoooO00);
            if (o0oooo1.f13155OooO0OO) {
                oooo0OoooO00.clear();
                if (Log.isLoggable("RequestTracker", 2)) {
                    Log.v("RequestTracker", "Paused, delaying request");
                }
                o0oooo1.f13154OooO0O0.add(oooo0OoooO00);
            } else {
                oooo0OoooO00.OooOO0();
            }
        }
    }

    @Override // p170o00Ooo0o.OooOo
    @CheckResult
    /* JADX INFO: renamed from: OoooO0, reason: merged with bridge method [inline-methods] */
    public OooOOOO<TranscodeType> clone() {
        OooOOOO<TranscodeType> oooOOOO = (OooOOOO) super.clone();
        oooOOOO.f12976Oooo00o = oooOOOO.f12976Oooo00o.clone();
        if (oooOOOO.f12977Oooo0O0 != null) {
            oooOOOO.f12977Oooo0O0 = new ArrayList(oooOOOO.f12977Oooo0O0);
        }
        OooOOOO<TranscodeType> oooOOOO2 = oooOOOO.f12978Oooo0OO;
        if (oooOOOO2 != null) {
            oooOOOO.f12978Oooo0OO = oooOOOO2.clone();
        }
        OooOOOO<TranscodeType> oooOOOO3 = oooOOOO.f12980Oooo0o0;
        if (oooOOOO3 != null) {
            oooOOOO.f12980Oooo0o0 = oooOOOO3.clone();
        }
        return oooOOOO;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0090  */
    /* JADX WARN: Code duplicated, block: B:48:0x0118  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Oooo0 OoooO00(int i, int i2, Priority priority, OooOo oooOo, p170o00Ooo0o.OooOo oooOo2, @Nullable RequestCoordinator requestCoordinator, @Nullable o000oOoO o000oooo2, o00000OO o00000oo2, Object obj, Executor executor) {
        com.bumptech.glide.request.OooO00o oooO00o;
        RequestCoordinator oooO00o2;
        Oooo0 oooo0Ooooo0o;
        int i3;
        Priority priority2;
        int i4;
        int i5;
        if (this.f12980Oooo0o0 != null) {
            oooO00o2 = new com.bumptech.glide.request.OooO00o(obj, requestCoordinator);
            oooO00o = oooO00o2;
        } else {
            oooO00o = 0;
            oooO00o2 = requestCoordinator;
        }
        OooOOOO<TranscodeType> oooOOOO = this.f12978Oooo0OO;
        if (oooOOOO == null) {
            oooo0Ooooo0o = Ooooo0o(i, i2, priority, oooOo, oooOo2, oooO00o2, o000oooo2, o00000oo2, obj, executor);
        } else {
            if (this.f12982Oooo0oo) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            OooOo oooOo3 = oooOOOO.f12979Oooo0o ? oooOo : oooOOOO.f12976Oooo00o;
            if (p170o00Ooo0o.OooOo.OooOOOo(oooOOOO.f38249OooO0Oo, 8)) {
                priority2 = this.f12978Oooo0OO.f38252OooO0oO;
            } else {
                int i6 = OooO00o.f12984OooO0O0[priority.ordinal()];
                if (i6 == 1) {
                    priority2 = Priority.NORMAL;
                } else if (i6 == 2) {
                    priority2 = Priority.HIGH;
                } else {
                    if (i6 != 3 && i6 != 4) {
                        throw new IllegalArgumentException("unknown priority: " + this.f38252OooO0oO);
                    }
                    priority2 = Priority.IMMEDIATE;
                }
            }
            Priority priority3 = priority2;
            OooOOOO<TranscodeType> oooOOOO2 = this.f12978Oooo0OO;
            int i7 = oooOOOO2.f38257OooOOO;
            int i8 = oooOOOO2.f38258OooOOO0;
            if (o00OO0O0.OooO0oo(i, i2)) {
                OooOOOO<TranscodeType> oooOOOO3 = this.f12978Oooo0OO;
                if (o00OO0O0.OooO0oo(oooOOOO3.f38257OooOOO, oooOOOO3.f38258OooOOO0)) {
                    i4 = i8;
                    i5 = i7;
                } else {
                    i5 = oooOo2.f38257OooOOO;
                    i4 = oooOo2.f38258OooOOO0;
                }
            } else {
                i4 = i8;
                i5 = i7;
            }
            com.bumptech.glide.request.OooO0O0 oooO0O0 = new com.bumptech.glide.request.OooO0O0(obj, oooO00o2);
            o00Ooo o00oooOoooo0o = Ooooo0o(i, i2, priority, oooOo, oooOo2, oooO0O0, o000oooo2, o00000oo2, obj, executor);
            this.f12982Oooo0oo = true;
            OooOOOO<TranscodeType> oooOOOO4 = this.f12978Oooo0OO;
            Oooo0 oooo0OoooO00 = oooOOOO4.OoooO00(i5, i4, priority3, oooOo3, oooOOOO4, oooO0O0, o000oooo2, o00000oo2, obj, executor);
            this.f12982Oooo0oo = false;
            oooO0O0.f13166OooO0OO = o00oooOoooo0o;
            oooO0O0.f13167OooO0Oo = oooo0OoooO00;
            oooo0Ooooo0o = oooO0O0;
        }
        if (oooO00o == 0) {
            return oooo0Ooooo0o;
        }
        OooOOOO<TranscodeType> oooOOOO5 = this.f12980Oooo0o0;
        int i9 = oooOOOO5.f38257OooOOO;
        int i10 = oooOOOO5.f38258OooOOO0;
        if (o00OO0O0.OooO0oo(i, i2)) {
            OooOOOO<TranscodeType> oooOOOO6 = this.f12980Oooo0o0;
            if (o00OO0O0.OooO0oo(oooOOOO6.f38257OooOOO, oooOOOO6.f38258OooOOO0)) {
                i3 = i10;
            } else {
                int i11 = oooOo2.f38257OooOOO;
                i3 = oooOo2.f38258OooOOO0;
                i9 = i11;
            }
        } else {
            i3 = i10;
        }
        OooOOOO<TranscodeType> oooOOOO7 = this.f12980Oooo0o0;
        Oooo0 oooo0OoooO01 = oooOOOO7.OoooO00(i9, i3, oooOOOO7.f38252OooO0oO, oooOOOO7.f12976Oooo00o, oooOOOO7, oooO00o, o000oooo2, o00000oo2, obj, executor);
        oooO00o.f13160OooO0OO = oooo0Ooooo0o;
        oooO00o.f13161OooO0Oo = oooo0OoooO01;
        return oooO00o;
    }

    @NonNull
    public final void OoooO0O(@NonNull ImageView imageView) {
        p170o00Ooo0o.OooOo oooOoOooOOo;
        o00000OO o000000o2;
        o00OO0O0.OooO00o();
        o00OO00O.OooO0O0(imageView);
        if (!p170o00Ooo0o.OooOo.OooOOOo(this.f38249OooO0Oo, 2048) && this.f38262OooOOo0 && imageView.getScaleType() != null) {
            switch (OooO00o.f12983OooO00o[imageView.getScaleType().ordinal()]) {
                case 1:
                    oooOoOooOOo = clone().OooOOo();
                    break;
                case 2:
                    oooOoOooOOo = clone().OooOOoo();
                    break;
                case 3:
                case 4:
                case 5:
                    oooOoOooOOo = clone().OooOo00();
                    break;
                case 6:
                    oooOoOooOOo = clone().OooOOoo();
                    break;
                default:
                    oooOoOooOOo = this;
                    break;
            }
        } else {
            oooOoOooOOo = this;
        }
        this.f12975Oooo00O.f12932OooO0OO.getClass();
        Class<TranscodeType> cls = this.f12974Oooo000;
        if (Bitmap.class.equals(cls)) {
            o000000o2 = new o000OOo(imageView);
        } else {
            if (!Drawable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
            }
            o000000o2 = new o000000O(imageView);
        }
        OoooO(o000000o2, null, oooOoOooOOo, o00O0OO0.f38344OooO00o);
    }

    @NonNull
    @CheckResult
    public OooOOOO OoooOO0() {
        return Ooooo00(null).OooO0O0(new o00O0O().OooO(o000O00O.f37588OooO00o));
    }

    @NonNull
    @CheckResult
    public OooOOOO OoooOOo(@Nullable GifDecoder gifDecoder) {
        return Ooooo00(gifDecoder);
    }

    @NonNull
    @CheckResult
    public OooOOOO<TranscodeType> OoooOo0(@Nullable @DrawableRes @RawRes Integer num) {
        return Oooo(Ooooo00(num));
    }

    @NonNull
    @CheckResult
    public OooOOOO<TranscodeType> OoooOoO(@Nullable String str) {
        return Ooooo00(str);
    }

    @NonNull
    @CheckResult
    public OooOOOO OoooOoo() {
        return Ooooo00(null);
    }

    @NonNull
    public final OooOOOO<TranscodeType> Ooooo00(@Nullable Object obj) {
        if (this.f38270OooOoO0) {
            return clone().Ooooo00(obj);
        }
        this.f12973Oooo0 = obj;
        this.f12981Oooo0oO = true;
        OooOoo0();
        return this;
    }

    public final o00Ooo Ooooo0o(int i, int i2, Priority priority, OooOo oooOo, p170o00Ooo0o.OooOo oooOo2, RequestCoordinator requestCoordinator, o000oOoO o000oooo2, o00000OO o00000oo2, Object obj, Executor executor) {
        Context context = this.f12971OooOooO;
        Object obj2 = this.f12973Oooo0;
        Class<TranscodeType> cls = this.f12974Oooo000;
        ArrayList arrayList = this.f12977Oooo0O0;
        OooO oooO = this.f12975Oooo00O;
        return new o00Ooo(context, oooO, obj, obj2, cls, oooOo2, i, i2, priority, o00000oo2, o000oooo2, arrayList, requestCoordinator, oooO.f12936OooO0oO, oooOo.f12985OooO0Oo, executor);
    }

    @NonNull
    @CheckResult
    public OooOOOO<TranscodeType> OooooO0(@Nullable OooOOOO<TranscodeType> oooOOOO) {
        if (this.f38270OooOoO0) {
            return clone().OooooO0(oooOOOO);
        }
        this.f12978Oooo0OO = oooOOOO;
        OooOoo0();
        return this;
    }

    @Override // p170o00Ooo0o.OooOo
    public final boolean equals(Object obj) {
        if (obj instanceof OooOOOO) {
            OooOOOO oooOOOO = (OooOOOO) obj;
            if (super.equals(oooOOOO)) {
                if (Objects.equals(this.f12974Oooo000, oooOOOO.f12974Oooo000) && this.f12976Oooo00o.equals(oooOOOO.f12976Oooo00o) && Objects.equals(this.f12973Oooo0, oooOOOO.f12973Oooo0) && Objects.equals(this.f12977Oooo0O0, oooOOOO.f12977Oooo0O0) && Objects.equals(this.f12978Oooo0OO, oooOOOO.f12978Oooo0OO) && Objects.equals(this.f12980Oooo0o0, oooOOOO.f12980Oooo0o0) && this.f12979Oooo0o == oooOOOO.f12979Oooo0o && this.f12981Oooo0oO == oooOOOO.f12981Oooo0oO) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p170o00Ooo0o.OooOo
    public final int hashCode() {
        return o00OO0O0.OooO0oO(o00OO0O0.OooO0oO(o00OO0O0.OooO0o(o00OO0O0.OooO0o(o00OO0O0.OooO0o(o00OO0O0.OooO0o(o00OO0O0.OooO0o(o00OO0O0.OooO0o(o00OO0O0.OooO0o(super.hashCode(), this.f12974Oooo000), this.f12976Oooo00o), this.f12973Oooo0), this.f12977Oooo0O0), this.f12978Oooo0OO), this.f12980Oooo0o0), null), this.f12979Oooo0o), this.f12981Oooo0oO);
    }

    @NonNull
    @CheckResult
    public OooOOOO<TranscodeType> o000oOoO(@Nullable Uri uri) {
        OooOOOO<TranscodeType> oooOOOOOoooo00 = Ooooo00(uri);
        return (uri == null || !"android.resource".equals(uri.getScheme())) ? oooOOOOOoooo00 : Oooo(oooOOOOOoooo00);
    }
}
