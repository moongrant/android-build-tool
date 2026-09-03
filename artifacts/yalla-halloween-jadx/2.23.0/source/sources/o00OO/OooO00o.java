package o00OO;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.yallatech.support.platform.share.bean.ShareRequest;
import com.zego.zegoliveroom.constants.ZegoConstants;
import kotlin.ULong;
import kotlin.io.ConstantsKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import o00OO.OooO00o;
import o00OO0O0.OooOOO;
import o00OO0O0.OooOo;
import o00OO0O0.Oooo000;
import o00OO0O0.o000oOoO;
import o00OO0O0.o00O0O;
import o00OO0OO.OooOo00;
import org.conscrypt.PSKKeyManager;
import p126o00O0oOo.o00000;
import p126o00O0oOo.o000000;
import p126o00O0oOo.o000000O;
import p126o00O0oOo.o00000OO;
import p126o00O0oOo.o000OOo;
import p127o00O0oo.oo0o0Oo;
import p532o0o0Oo.o0000O00;
import p532o0o0Oo.o0000oo;
import p532o0o0Oo.o0O0O00;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OooO00o<T extends OooO00o<T>> implements Cloneable {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f36991OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f36992OooO0Oo;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public Drawable f36996OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public Drawable f36997OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f36998OooOO0O;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f37003OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public Drawable f37004OooOOo;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f37006OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @Nullable
    public Resources.Theme f37007OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f37011OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f37012OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f37013OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f37014OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public boolean f37015OooOoo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public float f36994OooO0o0 = 1.0f;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public oo0o0Oo f36993OooO0o = oo0o0Oo.f36941OooO0Oo;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public Priority f36995OooO0oO = Priority.NORMAL;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f36999OooOO0o = true;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f37001OooOOO0 = -1;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f37000OooOOO = -1;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NonNull
    public o000OOo f37002OooOOOO = o00OOO0O.OooO0OO.f37348OooO0O0;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f37005OooOOo0 = true;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NonNull
    public o00000 f37009OooOo00 = new o00000();

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NonNull
    public o0O0O00 f37008OooOo0 = new o0O0O00();

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NonNull
    public Class<?> f37010OooOo0O = Object.class;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f37016OooOoo0 = true;

    public static boolean OooOOOO(int i, int i2) {
        return (i & i2) != 0;
    }

    @NonNull
    @CheckResult
    public T OooO(@NonNull oo0o0Oo oo0o0oo) {
        if (this.f37013OooOoO0) {
            return (T) clone().OooO(oo0o0oo);
        }
        o0000O00.OooO0O0(oo0o0oo);
        this.f36993OooO0o = oo0o0oo;
        this.f36992OooO0Oo |= 4;
        OooOoo0();
        return this;
    }

    @NonNull
    @CheckResult
    public T OooO0O0(@NonNull OooO00o<?> oooO00o) {
        if (this.f37013OooOoO0) {
            return (T) clone().OooO0O0(oooO00o);
        }
        if (OooOOOO(oooO00o.f36992OooO0Oo, 2)) {
            this.f36994OooO0o0 = oooO00o.f36994OooO0o0;
        }
        if (OooOOOO(oooO00o.f36992OooO0Oo, 262144)) {
            this.f37012OooOoO = oooO00o.f37012OooOoO;
        }
        if (OooOOOO(oooO00o.f36992OooO0Oo, ZegoConstants.ErrorMask.RoomServerErrorMask)) {
            this.f37015OooOoo = oooO00o.f37015OooOoo;
        }
        if (OooOOOO(oooO00o.f36992OooO0Oo, 4)) {
            this.f36993OooO0o = oooO00o.f36993OooO0o;
        }
        if (OooOOOO(oooO00o.f36992OooO0Oo, 8)) {
            this.f36995OooO0oO = oooO00o.f36995OooO0oO;
        }
        if (OooOOOO(oooO00o.f36992OooO0Oo, 16)) {
            this.f36996OooO0oo = oooO00o.f36996OooO0oo;
            this.f36991OooO = 0;
            this.f36992OooO0Oo &= -33;
        }
        if (OooOOOO(oooO00o.f36992OooO0Oo, 32)) {
            this.f36991OooO = oooO00o.f36991OooO;
            this.f36996OooO0oo = null;
            this.f36992OooO0Oo &= -17;
        }
        if (OooOOOO(oooO00o.f36992OooO0Oo, 64)) {
            this.f36997OooOO0 = oooO00o.f36997OooOO0;
            this.f36998OooOO0O = 0;
            this.f36992OooO0Oo &= -129;
        }
        if (OooOOOO(oooO00o.f36992OooO0Oo, 128)) {
            this.f36998OooOO0O = oooO00o.f36998OooOO0O;
            this.f36997OooOO0 = null;
            this.f36992OooO0Oo &= -65;
        }
        if (OooOOOO(oooO00o.f36992OooO0Oo, PSKKeyManager.MAX_KEY_LENGTH_BYTES)) {
            this.f36999OooOO0o = oooO00o.f36999OooOO0o;
        }
        if (OooOOOO(oooO00o.f36992OooO0Oo, ConstantsKt.MINIMUM_BLOCK_SIZE)) {
            this.f37000OooOOO = oooO00o.f37000OooOOO;
            this.f37001OooOOO0 = oooO00o.f37001OooOOO0;
        }
        if (OooOOOO(oooO00o.f36992OooO0Oo, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY)) {
            this.f37002OooOOOO = oooO00o.f37002OooOOOO;
        }
        if (OooOOOO(oooO00o.f36992OooO0Oo, 4096)) {
            this.f37010OooOo0O = oooO00o.f37010OooOo0O;
        }
        if (OooOOOO(oooO00o.f36992OooO0Oo, 8192)) {
            this.f37004OooOOo = oooO00o.f37004OooOOo;
            this.f37006OooOOoo = 0;
            this.f36992OooO0Oo &= -16385;
        }
        if (OooOOOO(oooO00o.f36992OooO0Oo, 16384)) {
            this.f37006OooOOoo = oooO00o.f37006OooOOoo;
            this.f37004OooOOo = null;
            this.f36992OooO0Oo &= -8193;
        }
        if (OooOOOO(oooO00o.f36992OooO0Oo, ShareRequest.THUMB_DATA_SIZE_LIMIT)) {
            this.f37007OooOo = oooO00o.f37007OooOo;
        }
        if (OooOOOO(oooO00o.f36992OooO0Oo, 65536)) {
            this.f37005OooOOo0 = oooO00o.f37005OooOOo0;
        }
        if (OooOOOO(oooO00o.f36992OooO0Oo, 131072)) {
            this.f37003OooOOOo = oooO00o.f37003OooOOOo;
        }
        if (OooOOOO(oooO00o.f36992OooO0Oo, 2048)) {
            this.f37008OooOo0.putAll(oooO00o.f37008OooOo0);
            this.f37016OooOoo0 = oooO00o.f37016OooOoo0;
        }
        if (OooOOOO(oooO00o.f36992OooO0Oo, 524288)) {
            this.f37014OooOoOO = oooO00o.f37014OooOoOO;
        }
        if (!this.f37005OooOOo0) {
            this.f37008OooOo0.clear();
            int i = this.f36992OooO0Oo & (-2049);
            this.f37003OooOOOo = false;
            this.f36992OooO0Oo = i & (-131073);
            this.f37016OooOoo0 = true;
        }
        this.f36992OooO0Oo |= oooO00o.f36992OooO0Oo;
        this.f37009OooOo00.f36724OooO0O0.OooO(oooO00o.f37009OooOo00.f36724OooO0O0);
        OooOoo0();
        return this;
    }

    @NonNull
    public T OooO0Oo() {
        if (this.f37011OooOo0o && !this.f37013OooOoO0) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.f37013OooOoO0 = true;
        return (T) OooOOOo();
    }

    @NonNull
    @CheckResult
    public T OooO0o() {
        return (T) OooOoOO(DownsampleStrategy.f9985OooO0O0, new Oooo000(), true);
    }

    @NonNull
    @CheckResult
    public T OooO0o0() {
        return (T) Oooo00o(DownsampleStrategy.f9986OooO0OO, new OooOo());
    }

    @Override // 
    @CheckResult
    /* JADX INFO: renamed from: OooO0oO, reason: merged with bridge method [inline-methods] */
    public T clone() {
        try {
            T t = (T) super.clone();
            o00000 o00000Var = new o00000();
            t.f37009OooOo00 = o00000Var;
            o00000Var.f36724OooO0O0.OooO(this.f37009OooOo00.f36724OooO0O0);
            o0O0O00 o0o0o00 = new o0O0O00();
            t.f37008OooOo0 = o0o0o00;
            o0o0o00.putAll(this.f37008OooOo0);
            t.f37011OooOo0o = false;
            t.f37013OooOoO0 = false;
            return t;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @NonNull
    @CheckResult
    public T OooO0oo(@NonNull Class<?> cls) {
        if (this.f37013OooOoO0) {
            return (T) clone().OooO0oo(cls);
        }
        this.f37010OooOo0O = cls;
        this.f36992OooO0Oo |= 4096;
        OooOoo0();
        return this;
    }

    @NonNull
    @CheckResult
    public T OooOO0(@NonNull DownsampleStrategy downsampleStrategy) {
        o000000O o000000o2 = DownsampleStrategy.f9988OooO0o;
        o0000O00.OooO0O0(downsampleStrategy);
        return (T) OooOoo(o000000o2, downsampleStrategy);
    }

    @NonNull
    @CheckResult
    public T OooOO0O(@DrawableRes int i) {
        if (this.f37013OooOoO0) {
            return (T) clone().OooOO0O(i);
        }
        this.f36991OooO = i;
        int i2 = this.f36992OooO0Oo | 32;
        this.f36996OooO0oo = null;
        this.f36992OooO0Oo = i2 & (-17);
        OooOoo0();
        return this;
    }

    @NonNull
    @CheckResult
    public T OooOO0o(@Nullable Drawable drawable) {
        if (this.f37013OooOoO0) {
            return (T) clone().OooOO0o(drawable);
        }
        this.f36996OooO0oo = drawable;
        int i = this.f36992OooO0Oo | 16;
        this.f36991OooO = 0;
        this.f36992OooO0Oo = i & (-33);
        OooOoo0();
        return this;
    }

    @NonNull
    @CheckResult
    public T OooOOO(@IntRange(from = ULong.MIN_VALUE) long j) {
        return (T) OooOoo(o00OO0O0.o000OOo.f37214OooO0Oo, Long.valueOf(j));
    }

    @NonNull
    @CheckResult
    public T OooOOO0() {
        return (T) OooOoOO(DownsampleStrategy.f9984OooO00o, new o00O0O(), true);
    }

    @NonNull
    public T OooOOOo() {
        this.f37011OooOo0o = true;
        return this;
    }

    @NonNull
    @CheckResult
    public T OooOOo() {
        return (T) OooOo0(DownsampleStrategy.f9986OooO0OO, new OooOo());
    }

    @NonNull
    @CheckResult
    public T OooOOoo() {
        return (T) OooOoOO(DownsampleStrategy.f9985OooO0O0, new Oooo000(), false);
    }

    @NonNull
    @CheckResult
    public T OooOo(@Nullable Drawable drawable) {
        if (this.f37013OooOoO0) {
            return (T) clone().OooOo(drawable);
        }
        this.f36997OooOO0 = drawable;
        int i = this.f36992OooO0Oo | 64;
        this.f36998OooOO0O = 0;
        this.f36992OooO0Oo = i & (-129);
        OooOoo0();
        return this;
    }

    @NonNull
    public final OooO00o OooOo0(@NonNull DownsampleStrategy downsampleStrategy, @NonNull OooOOO oooOOO) {
        if (this.f37013OooOoO0) {
            return clone().OooOo0(downsampleStrategy, oooOOO);
        }
        OooOO0(downsampleStrategy);
        return Oooo0OO(oooOOO, false);
    }

    @NonNull
    @CheckResult
    public T OooOo00() {
        return (T) OooOoOO(DownsampleStrategy.f9984OooO00o, new o00O0O(), false);
    }

    @NonNull
    @CheckResult
    public T OooOo0O(int i, int i2) {
        if (this.f37013OooOoO0) {
            return (T) clone().OooOo0O(i, i2);
        }
        this.f37000OooOOO = i;
        this.f37001OooOOO0 = i2;
        this.f36992OooO0Oo |= ConstantsKt.MINIMUM_BLOCK_SIZE;
        OooOoo0();
        return this;
    }

    @NonNull
    @CheckResult
    public T OooOo0o(@DrawableRes int i) {
        if (this.f37013OooOoO0) {
            return (T) clone().OooOo0o(i);
        }
        this.f36998OooOO0O = i;
        int i2 = this.f36992OooO0Oo | 128;
        this.f36997OooOO0 = null;
        this.f36992OooO0Oo = i2 & (-65);
        OooOoo0();
        return this;
    }

    public final T OooOoO(@NonNull o000000O<?> o000000o2) {
        if (this.f37013OooOoO0) {
            return (T) clone().OooOoO(o000000o2);
        }
        this.f37009OooOo00.f36724OooO0O0.remove(o000000o2);
        OooOoo0();
        return this;
    }

    @NonNull
    @CheckResult
    public T OooOoO0(@NonNull Priority priority) {
        if (this.f37013OooOoO0) {
            return (T) clone().OooOoO0(priority);
        }
        o0000O00.OooO0O0(priority);
        this.f36995OooO0oO = priority;
        this.f36992OooO0Oo |= 8;
        OooOoo0();
        return this;
    }

    @NonNull
    public final OooO00o OooOoOO(@NonNull DownsampleStrategy downsampleStrategy, @NonNull OooOOO oooOOO, boolean z) {
        OooO00o Oooo00o2 = z ? Oooo00o(downsampleStrategy, oooOOO) : OooOo0(downsampleStrategy, oooOOO);
        Oooo00o2.f37016OooOoo0 = true;
        return Oooo00o2;
    }

    @NonNull
    @CheckResult
    public <Y> T OooOoo(@NonNull o000000O<Y> o000000o2, @NonNull Y y) {
        if (this.f37013OooOoO0) {
            return (T) clone().OooOoo(o000000o2, y);
        }
        o0000O00.OooO0O0(o000000o2);
        o0000O00.OooO0O0(y);
        this.f37009OooOo00.f36724OooO0O0.put(o000000o2, y);
        OooOoo0();
        return this;
    }

    @NonNull
    public final void OooOoo0() {
        if (this.f37011OooOo0o) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    @NonNull
    @CheckResult
    public T OooOooo(@NonNull o000OOo o000ooo2) {
        if (this.f37013OooOoO0) {
            return (T) clone().OooOooo(o000ooo2);
        }
        this.f37002OooOOOO = o000ooo2;
        this.f36992OooO0Oo |= LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        OooOoo0();
        return this;
    }

    @NonNull
    public final <Y> T Oooo0(@NonNull Class<Y> cls, @NonNull o00000OO<Y> o00000oo2, boolean z) {
        if (this.f37013OooOoO0) {
            return (T) clone().Oooo0(cls, o00000oo2, z);
        }
        o0000O00.OooO0O0(o00000oo2);
        this.f37008OooOo0.put(cls, o00000oo2);
        int i = this.f36992OooO0Oo | 2048;
        this.f37005OooOOo0 = true;
        int i2 = i | 65536;
        this.f36992OooO0Oo = i2;
        this.f37016OooOoo0 = false;
        if (z) {
            this.f36992OooO0Oo = i2 | 131072;
            this.f37003OooOOOo = true;
        }
        OooOoo0();
        return this;
    }

    @NonNull
    @CheckResult
    public T Oooo000(boolean z) {
        if (this.f37013OooOoO0) {
            return (T) clone().Oooo000(true);
        }
        this.f36999OooOO0o = !z;
        this.f36992OooO0Oo |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        OooOoo0();
        return this;
    }

    @NonNull
    @CheckResult
    public T Oooo00O(@Nullable Resources.Theme theme) {
        if (this.f37013OooOoO0) {
            return (T) clone().Oooo00O(theme);
        }
        this.f37007OooOo = theme;
        if (theme != null) {
            this.f36992OooO0Oo |= ShareRequest.THUMB_DATA_SIZE_LIMIT;
            return (T) OooOoo(OooOo00.f37261OooO0O0, theme);
        }
        this.f36992OooO0Oo &= -32769;
        return (T) OooOoO(OooOo00.f37261OooO0O0);
    }

    @NonNull
    @CheckResult
    public final OooO00o Oooo00o(@NonNull DownsampleStrategy downsampleStrategy, @NonNull OooOOO oooOOO) {
        if (this.f37013OooOoO0) {
            return clone().Oooo00o(downsampleStrategy, oooOOO);
        }
        OooOO0(downsampleStrategy);
        return Oooo0O0(oooOOO);
    }

    @NonNull
    @CheckResult
    public T Oooo0O0(@NonNull o00000OO<Bitmap> o00000oo2) {
        return (T) Oooo0OO(o00000oo2, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public final T Oooo0OO(@NonNull o00000OO<Bitmap> o00000oo2, boolean z) {
        if (this.f37013OooOoO0) {
            return (T) clone().Oooo0OO(o00000oo2, z);
        }
        o000oOoO o000oooo2 = new o000oOoO(o00000oo2, z);
        Oooo0(Bitmap.class, o00000oo2, z);
        Oooo0(Drawable.class, o000oooo2, z);
        Oooo0(BitmapDrawable.class, o000oooo2, z);
        Oooo0(p131o00OO0o.OooO.class, new p131o00OO0o.OooOOO0(o00000oo2), z);
        OooOoo0();
        return this;
    }

    @NonNull
    @CheckResult
    public OooO00o Oooo0o() {
        if (this.f37013OooOoO0) {
            return clone().Oooo0o();
        }
        this.f37015OooOoo = true;
        this.f36992OooO0Oo |= ZegoConstants.ErrorMask.RoomServerErrorMask;
        OooOoo0();
        return this;
    }

    @NonNull
    @CheckResult
    public T Oooo0o0(@NonNull o00000OO<Bitmap>... o00000ooArr) {
        if (o00000ooArr.length > 1) {
            return (T) Oooo0OO(new o000000(o00000ooArr), true);
        }
        if (o00000ooArr.length == 1) {
            return (T) Oooo0O0(o00000ooArr[0]);
        }
        OooOoo0();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof OooO00o) {
            OooO00o oooO00o = (OooO00o) obj;
            if (Float.compare(oooO00o.f36994OooO0o0, this.f36994OooO0o0) == 0 && this.f36991OooO == oooO00o.f36991OooO && o0000oo.OooO0O0(this.f36996OooO0oo, oooO00o.f36996OooO0oo) && this.f36998OooOO0O == oooO00o.f36998OooOO0O && o0000oo.OooO0O0(this.f36997OooOO0, oooO00o.f36997OooOO0) && this.f37006OooOOoo == oooO00o.f37006OooOOoo && o0000oo.OooO0O0(this.f37004OooOOo, oooO00o.f37004OooOOo) && this.f36999OooOO0o == oooO00o.f36999OooOO0o && this.f37001OooOOO0 == oooO00o.f37001OooOOO0 && this.f37000OooOOO == oooO00o.f37000OooOOO && this.f37003OooOOOo == oooO00o.f37003OooOOOo && this.f37005OooOOo0 == oooO00o.f37005OooOOo0 && this.f37012OooOoO == oooO00o.f37012OooOoO && this.f37014OooOoOO == oooO00o.f37014OooOoOO && this.f36993OooO0o.equals(oooO00o.f36993OooO0o) && this.f36995OooO0oO == oooO00o.f36995OooO0oO && this.f37009OooOo00.equals(oooO00o.f37009OooOo00) && this.f37008OooOo0.equals(oooO00o.f37008OooOo0) && this.f37010OooOo0O.equals(oooO00o.f37010OooOo0O) && o0000oo.OooO0O0(this.f37002OooOOOO, oooO00o.f37002OooOOOO) && o0000oo.OooO0O0(this.f37007OooOo, oooO00o.f37007OooOo)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        float f = this.f36994OooO0o0;
        char[] cArr = o0000oo.f54571OooO00o;
        return o0000oo.OooO0o(o0000oo.OooO0o(o0000oo.OooO0o(o0000oo.OooO0o(o0000oo.OooO0o(o0000oo.OooO0o(o0000oo.OooO0o(o0000oo.OooO0oO(o0000oo.OooO0oO(o0000oo.OooO0oO(o0000oo.OooO0oO((((o0000oo.OooO0oO(o0000oo.OooO0o((o0000oo.OooO0o((o0000oo.OooO0o(((Float.floatToIntBits(f) + 527) * 31) + this.f36991OooO, this.f36996OooO0oo) * 31) + this.f36998OooOO0O, this.f36997OooOO0) * 31) + this.f37006OooOOoo, this.f37004OooOOo), this.f36999OooOO0o) * 31) + this.f37001OooOOO0) * 31) + this.f37000OooOOO, this.f37003OooOOOo), this.f37005OooOOo0), this.f37012OooOoO), this.f37014OooOoOO), this.f36993OooO0o), this.f36995OooO0oO), this.f37009OooOo00), this.f37008OooOo0), this.f37010OooOo0O), this.f37002OooOOOO), this.f37007OooOo);
    }
}
