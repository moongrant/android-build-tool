package p234o00oOoOO;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.yallatech.support.platform.share.bean.ShareRequest;
import java.util.Map;
import java.util.Objects;
import p214o00oO0.o00O;
import p217o00oO00o.o00000;
import p217o00oO00o.o000000;
import p217o00oO00o.o000000O;
import p217o00oO00o.o00000OO;
import p224o00oOOOo.oO0OO00;
import p224o00oOOOo.oO0Oo0o0;
import p224o00oOOOo.ooOOO00O;
import p224o00oOOOo.ooOOO0Oo;
import p234o00oOoOO.oOO0O0;
import p238o00oOooO.oOOOOo0O;
import p238o00oOooO.oOo0o00;
import p239o00oOooo.a;
import p243o00oo00O.o0000;
import p243o00oo00O.o000O000;

/* JADX INFO: loaded from: classes.dex */
public abstract class oOO0O0<T extends oOO0O0<T>> implements Cloneable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f33961Oooo0o;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public int f33964OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f33965OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @Nullable
    public Drawable f33966OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @Nullable
    public Drawable f33967OoooO0O;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public boolean f33971OoooOo0;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @Nullable
    public Drawable f33973OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public int f33974Ooooo00;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public boolean f33978OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public boolean f33979Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    @Nullable
    public Resources.Theme f33980Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public boolean f33981OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public boolean f33982Ooooooo;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public boolean f33985ooOO;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public float f33962Oooo0oO = 1.0f;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NonNull
    public o00O f33963Oooo0oo = o00O.f33390OooO0Oo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NonNull
    public Priority f33960Oooo = Priority.NORMAL;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public boolean f33968OoooOO0 = true;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public int f33983o000oOoO = -1;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public int f33969OoooOOO = -1;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @NonNull
    public o000000 f33970OoooOOo = a.f34111OooO0O0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public boolean f33972OoooOoO = true;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @NonNull
    public o00000 f33975Ooooo0o = new o00000();

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @NonNull
    public Map<Class<?>, o00000OO<?>> f33976OooooO0 = new o0000();

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @NonNull
    public Class<?> f33977OooooOO = Object.class;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public boolean f33984o0OoOo0 = true;

    public static boolean OooOOOO(int i, int i2) {
        return (i & i2) != 0;
    }

    @NonNull
    @CheckResult
    public T OooO(@NonNull Class<?> cls) {
        if (this.f33979Oooooo) {
            return (T) clone().OooO(cls);
        }
        this.f33977OooooOO = cls;
        this.f33961Oooo0o |= 4096;
        OooOoO0();
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v45, types: [java.util.Map<java.lang.Class<?>, o00oO00o.o00000OO<?>>, o00oo00O.o0000] */
    @NonNull
    @CheckResult
    public T OooO0OO(@NonNull oOO0O0<?> ooo0o0) {
        if (this.f33979Oooooo) {
            return (T) clone().OooO0OO(ooo0o0);
        }
        if (OooOOOO(ooo0o0.f33961Oooo0o, 2)) {
            this.f33962Oooo0oO = ooo0o0.f33962Oooo0oO;
        }
        if (OooOOOO(ooo0o0.f33961Oooo0o, 262144)) {
            this.f33981OoooooO = ooo0o0.f33981OoooooO;
        }
        if (OooOOOO(ooo0o0.f33961Oooo0o, 1048576)) {
            this.f33985ooOO = ooo0o0.f33985ooOO;
        }
        if (OooOOOO(ooo0o0.f33961Oooo0o, 4)) {
            this.f33963Oooo0oo = ooo0o0.f33963Oooo0oo;
        }
        if (OooOOOO(ooo0o0.f33961Oooo0o, 8)) {
            this.f33960Oooo = ooo0o0.f33960Oooo;
        }
        if (OooOOOO(ooo0o0.f33961Oooo0o, 16)) {
            this.f33966OoooO00 = ooo0o0.f33966OoooO00;
            this.f33965OoooO0 = 0;
            this.f33961Oooo0o &= -33;
        }
        if (OooOOOO(ooo0o0.f33961Oooo0o, 32)) {
            this.f33965OoooO0 = ooo0o0.f33965OoooO0;
            this.f33966OoooO00 = null;
            this.f33961Oooo0o &= -17;
        }
        if (OooOOOO(ooo0o0.f33961Oooo0o, 64)) {
            this.f33967OoooO0O = ooo0o0.f33967OoooO0O;
            this.f33964OoooO = 0;
            this.f33961Oooo0o &= -129;
        }
        if (OooOOOO(ooo0o0.f33961Oooo0o, 128)) {
            this.f33964OoooO = ooo0o0.f33964OoooO;
            this.f33967OoooO0O = null;
            this.f33961Oooo0o &= -65;
        }
        if (OooOOOO(ooo0o0.f33961Oooo0o, 256)) {
            this.f33968OoooOO0 = ooo0o0.f33968OoooOO0;
        }
        if (OooOOOO(ooo0o0.f33961Oooo0o, 512)) {
            this.f33969OoooOOO = ooo0o0.f33969OoooOOO;
            this.f33983o000oOoO = ooo0o0.f33983o000oOoO;
        }
        if (OooOOOO(ooo0o0.f33961Oooo0o, 1024)) {
            this.f33970OoooOOo = ooo0o0.f33970OoooOOo;
        }
        if (OooOOOO(ooo0o0.f33961Oooo0o, 4096)) {
            this.f33977OooooOO = ooo0o0.f33977OooooOO;
        }
        if (OooOOOO(ooo0o0.f33961Oooo0o, 8192)) {
            this.f33973OoooOoo = ooo0o0.f33973OoooOoo;
            this.f33974Ooooo00 = 0;
            this.f33961Oooo0o &= -16385;
        }
        if (OooOOOO(ooo0o0.f33961Oooo0o, 16384)) {
            this.f33974Ooooo00 = ooo0o0.f33974Ooooo00;
            this.f33973OoooOoo = null;
            this.f33961Oooo0o &= -8193;
        }
        if (OooOOOO(ooo0o0.f33961Oooo0o, ShareRequest.THUMB_DATA_SIZE_LIMIT)) {
            this.f33980Oooooo0 = ooo0o0.f33980Oooooo0;
        }
        if (OooOOOO(ooo0o0.f33961Oooo0o, 65536)) {
            this.f33972OoooOoO = ooo0o0.f33972OoooOoO;
        }
        if (OooOOOO(ooo0o0.f33961Oooo0o, 131072)) {
            this.f33971OoooOo0 = ooo0o0.f33971OoooOo0;
        }
        if (OooOOOO(ooo0o0.f33961Oooo0o, RecyclerView.oo0o0Oo.FLAG_MOVED)) {
            this.f33976OooooO0.putAll(ooo0o0.f33976OooooO0);
            this.f33984o0OoOo0 = ooo0o0.f33984o0OoOo0;
        }
        if (OooOOOO(ooo0o0.f33961Oooo0o, 524288)) {
            this.f33982Ooooooo = ooo0o0.f33982Ooooooo;
        }
        if (!this.f33972OoooOoO) {
            this.f33976OooooO0.clear();
            int i = this.f33961Oooo0o & (-2049);
            this.f33971OoooOo0 = false;
            this.f33961Oooo0o = i & (-131073);
            this.f33984o0OoOo0 = true;
        }
        this.f33961Oooo0o |= ooo0o0.f33961Oooo0o;
        this.f33975Ooooo0o.OooO0Oo(ooo0o0.f33975Ooooo0o);
        OooOoO0();
        return this;
    }

    @NonNull
    public T OooO0Oo() {
        if (this.f33978OooooOo && !this.f33979Oooooo) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.f33979Oooooo = true;
        return (T) OooOOOo();
    }

    @NonNull
    @CheckResult
    public T OooO0o() {
        T t = (T) OooOoo(DownsampleStrategy.f12506OooO0O0, new ooOOO00O());
        t.f33984o0OoOo0 = true;
        return t;
    }

    @NonNull
    @CheckResult
    public T OooO0o0() {
        return (T) OooOoo(DownsampleStrategy.f12507OooO0OO, new ooOOO0Oo());
    }

    @Override // 
    @CheckResult
    /* JADX INFO: renamed from: OooO0oO */
    public T clone() {
        try {
            T t = (T) super.clone();
            o00000 o00000Var = new o00000();
            t.f33975Ooooo0o = o00000Var;
            o00000Var.OooO0Oo(this.f33975Ooooo0o);
            o0000 o0000Var = new o0000();
            t.f33976OooooO0 = o0000Var;
            o0000Var.putAll(this.f33976OooooO0);
            t.f33978OooooOo = false;
            t.f33979Oooooo = false;
            return t;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @NonNull
    @CheckResult
    public T OooOO0(@NonNull o00O o00o2) {
        if (this.f33979Oooooo) {
            return (T) clone().OooOO0(o00o2);
        }
        this.f33963Oooo0oo = o00o2;
        this.f33961Oooo0o |= 4;
        OooOoO0();
        return this;
    }

    @NonNull
    @CheckResult
    public T OooOO0O(@NonNull DownsampleStrategy downsampleStrategy) {
        return (T) OooOoO(DownsampleStrategy.f12509OooO0o, downsampleStrategy);
    }

    @NonNull
    @CheckResult
    public T OooOO0o(@DrawableRes int i) {
        if (this.f33979Oooooo) {
            return (T) clone().OooOO0o(i);
        }
        this.f33965OoooO0 = i;
        int i2 = this.f33961Oooo0o | 32;
        this.f33966OoooO00 = null;
        this.f33961Oooo0o = i2 & (-17);
        OooOoO0();
        return this;
    }

    @NonNull
    @CheckResult
    public T OooOOO() {
        T t = (T) OooOoo(DownsampleStrategy.f12505OooO00o, new oO0Oo0o0());
        t.f33984o0OoOo0 = true;
        return t;
    }

    @NonNull
    @CheckResult
    public T OooOOO0(@Nullable Drawable drawable) {
        if (this.f33979Oooooo) {
            return (T) clone().OooOOO0(drawable);
        }
        this.f33966OoooO00 = drawable;
        int i = this.f33961Oooo0o | 16;
        this.f33965OoooO0 = 0;
        this.f33961Oooo0o = i & (-33);
        OooOoO0();
        return this;
    }

    @NonNull
    public T OooOOOo() {
        this.f33978OooooOo = true;
        return this;
    }

    @NonNull
    @CheckResult
    public T OooOOo() {
        T t = (T) OooOo00(DownsampleStrategy.f12506OooO0O0, new ooOOO00O());
        t.f33984o0OoOo0 = true;
        return t;
    }

    @NonNull
    @CheckResult
    public T OooOOo0() {
        return (T) OooOo00(DownsampleStrategy.f12507OooO0OO, new ooOOO0Oo());
    }

    @NonNull
    @CheckResult
    public T OooOOoo() {
        T t = (T) OooOo00(DownsampleStrategy.f12505OooO00o, new oO0Oo0o0());
        t.f33984o0OoOo0 = true;
        return t;
    }

    @NonNull
    @CheckResult
    public T OooOo(@NonNull Priority priority) {
        if (this.f33979Oooooo) {
            return (T) clone().OooOo(priority);
        }
        Objects.requireNonNull(priority, "Argument must not be null");
        this.f33960Oooo = priority;
        this.f33961Oooo0o |= 8;
        OooOoO0();
        return this;
    }

    @NonNull
    @CheckResult
    public T OooOo0(int i, int i2) {
        if (this.f33979Oooooo) {
            return (T) clone().OooOo0(i, i2);
        }
        this.f33969OoooOOO = i;
        this.f33983o000oOoO = i2;
        this.f33961Oooo0o |= 512;
        OooOoO0();
        return this;
    }

    @NonNull
    public final T OooOo00(@NonNull DownsampleStrategy downsampleStrategy, @NonNull o00000OO<Bitmap> o00000oo2) {
        if (this.f33979Oooooo) {
            return (T) clone().OooOo00(downsampleStrategy, o00000oo2);
        }
        OooOO0O(downsampleStrategy);
        return (T) Oooo000(o00000oo2, false);
    }

    @NonNull
    @CheckResult
    public T OooOo0O(@DrawableRes int i) {
        if (this.f33979Oooooo) {
            return (T) clone().OooOo0O(i);
        }
        this.f33964OoooO = i;
        int i2 = this.f33961Oooo0o | 128;
        this.f33967OoooO0O = null;
        this.f33961Oooo0o = i2 & (-65);
        OooOoO0();
        return this;
    }

    @NonNull
    @CheckResult
    public T OooOo0o(@Nullable Drawable drawable) {
        if (this.f33979Oooooo) {
            return (T) clone().OooOo0o(drawable);
        }
        this.f33967OoooO0O = drawable;
        int i = this.f33961Oooo0o | 64;
        this.f33964OoooO = 0;
        this.f33961Oooo0o = i & (-129);
        OooOoO0();
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [OooOooo.Oooo0<o00oO00o.o000000O<?>, java.lang.Object>, o00oo00O.o0000] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @NonNull
    @CheckResult
    public <Y> T OooOoO(@NonNull o000000O<Y> o000000o2, @NonNull Y y) {
        if (this.f33979Oooooo) {
            return (T) clone().OooOoO(o000000o2, y);
        }
        Objects.requireNonNull(o000000o2, "Argument must not be null");
        this.f33975Ooooo0o.f33630OooO0O0.put((o000000O<?>) o000000o2, y);
        OooOoO0();
        return this;
    }

    @NonNull
    public final T OooOoO0() {
        if (this.f33978OooooOo) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        return this;
    }

    @NonNull
    @CheckResult
    public T OooOoOO(@NonNull o000000 o000000Var) {
        if (this.f33979Oooooo) {
            return (T) clone().OooOoOO(o000000Var);
        }
        this.f33970OoooOOo = o000000Var;
        this.f33961Oooo0o |= 1024;
        OooOoO0();
        return this;
    }

    @NonNull
    @CheckResult
    public final T OooOoo(@NonNull DownsampleStrategy downsampleStrategy, @NonNull o00000OO<Bitmap> o00000oo2) {
        if (this.f33979Oooooo) {
            return (T) clone().OooOoo(downsampleStrategy, o00000oo2);
        }
        OooOO0O(downsampleStrategy);
        return (T) OooOooo(o00000oo2);
    }

    @NonNull
    @CheckResult
    public T OooOoo0(boolean z) {
        if (this.f33979Oooooo) {
            return (T) clone().OooOoo0(true);
        }
        this.f33968OoooOO0 = !z;
        this.f33961Oooo0o |= 256;
        OooOoO0();
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map<java.lang.Class<?>, o00oO00o.o00000OO<?>>, o00oo00O.o0000] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @NonNull
    public final <Y> T OooOooO(@NonNull Class<Y> cls, @NonNull o00000OO<Y> o00000oo2, boolean z) {
        if (this.f33979Oooooo) {
            return (T) clone().OooOooO(cls, o00000oo2, z);
        }
        Objects.requireNonNull(o00000oo2, "Argument must not be null");
        this.f33976OooooO0.put((Class<?>) cls, (o00000OO<?>) o00000oo2);
        int i = this.f33961Oooo0o | RecyclerView.oo0o0Oo.FLAG_MOVED;
        this.f33972OoooOoO = true;
        int i2 = i | 65536;
        this.f33961Oooo0o = i2;
        this.f33984o0OoOo0 = false;
        if (z) {
            this.f33961Oooo0o = i2 | 131072;
            this.f33971OoooOo0 = true;
        }
        OooOoO0();
        return this;
    }

    @NonNull
    @CheckResult
    public T OooOooo(@NonNull o00000OO<Bitmap> o00000oo2) {
        return (T) Oooo000(o00000oo2, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public final T Oooo000(@NonNull o00000OO<Bitmap> o00000oo2, boolean z) {
        if (this.f33979Oooooo) {
            return (T) clone().Oooo000(o00000oo2, z);
        }
        oO0OO00 oo0oo00 = new oO0OO00(o00000oo2, z);
        OooOooO(Bitmap.class, o00000oo2, z);
        OooOooO(Drawable.class, oo0oo00, z);
        OooOooO(BitmapDrawable.class, oo0oo00, z);
        OooOooO(oOOOOo0O.class, new oOo0o00(o00000oo2), z);
        OooOoO0();
        return this;
    }

    @NonNull
    @CheckResult
    public oOO0O0 Oooo00O() {
        if (this.f33979Oooooo) {
            return clone().Oooo00O();
        }
        this.f33985ooOO = true;
        this.f33961Oooo0o |= 1048576;
        OooOoO0();
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [OooOooo.o00oO0o, java.util.Map<java.lang.Class<?>, o00oO00o.o00000OO<?>>] */
    public final boolean equals(Object obj) {
        if (obj instanceof oOO0O0) {
            oOO0O0 ooo0o0 = (oOO0O0) obj;
            if (Float.compare(ooo0o0.f33962Oooo0oO, this.f33962Oooo0oO) == 0 && this.f33965OoooO0 == ooo0o0.f33965OoooO0 && o000O000.OooO0O0(this.f33966OoooO00, ooo0o0.f33966OoooO00) && this.f33964OoooO == ooo0o0.f33964OoooO && o000O000.OooO0O0(this.f33967OoooO0O, ooo0o0.f33967OoooO0O) && this.f33974Ooooo00 == ooo0o0.f33974Ooooo00 && o000O000.OooO0O0(this.f33973OoooOoo, ooo0o0.f33973OoooOoo) && this.f33968OoooOO0 == ooo0o0.f33968OoooOO0 && this.f33983o000oOoO == ooo0o0.f33983o000oOoO && this.f33969OoooOOO == ooo0o0.f33969OoooOOO && this.f33971OoooOo0 == ooo0o0.f33971OoooOo0 && this.f33972OoooOoO == ooo0o0.f33972OoooOoO && this.f33981OoooooO == ooo0o0.f33981OoooooO && this.f33982Ooooooo == ooo0o0.f33982Ooooooo && this.f33963Oooo0oo.equals(ooo0o0.f33963Oooo0oo) && this.f33960Oooo == ooo0o0.f33960Oooo && this.f33975Ooooo0o.equals(ooo0o0.f33975Ooooo0o) && this.f33976OooooO0.equals(ooo0o0.f33976OooooO0) && this.f33977OooooOO.equals(ooo0o0.f33977OooooOO) && o000O000.OooO0O0(this.f33970OoooOOo, ooo0o0.f33970OoooOOo) && o000O000.OooO0O0(this.f33980Oooooo0, ooo0o0.f33980Oooooo0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        float f = this.f33962Oooo0oO;
        char[] cArr = o000O000.f34177OooO00o;
        return o000O000.OooO0oO(this.f33980Oooooo0, o000O000.OooO0oO(this.f33970OoooOOo, o000O000.OooO0oO(this.f33977OooooOO, o000O000.OooO0oO(this.f33976OooooO0, o000O000.OooO0oO(this.f33975Ooooo0o, o000O000.OooO0oO(this.f33960Oooo, o000O000.OooO0oO(this.f33963Oooo0oo, (((((((((((((o000O000.OooO0oO(this.f33973OoooOoo, (o000O000.OooO0oO(this.f33967OoooO0O, (o000O000.OooO0oO(this.f33966OoooO00, ((Float.floatToIntBits(f) + 527) * 31) + this.f33965OoooO0) * 31) + this.f33964OoooO) * 31) + this.f33974Ooooo00) * 31) + (this.f33968OoooOO0 ? 1 : 0)) * 31) + this.f33983o000oOoO) * 31) + this.f33969OoooOOO) * 31) + (this.f33971OoooOo0 ? 1 : 0)) * 31) + (this.f33972OoooOoO ? 1 : 0)) * 31) + (this.f33981OoooooO ? 1 : 0)) * 31) + (this.f33982Ooooooo ? 1 : 0))))))));
    }
}
