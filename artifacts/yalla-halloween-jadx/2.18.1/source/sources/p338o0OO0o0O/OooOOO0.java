package p338o0OO0o0O;

import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO0 extends Property<Drawable, Integer> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Property<Drawable, Integer> f37980OooO00o = new OooOOO0();

    public OooOOO0() {
        super(Integer.class, "drawableAlphaCompat");
        new WeakHashMap();
    }

    @Override // android.util.Property
    @Nullable
    public final Integer get(@NonNull Drawable drawable) {
        return Integer.valueOf(drawable.getAlpha());
    }

    @Override // android.util.Property
    public final void set(@NonNull Drawable drawable, @NonNull Integer num) {
        drawable.setAlpha(num.intValue());
    }
}
