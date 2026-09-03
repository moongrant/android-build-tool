package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final TextView f2990OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final p061o0000o0O.oo0o0Oo f2991OooO0O0;

    public OooOOOO(@NonNull TextView textView) {
        this.f2990OooO00o = textView;
        this.f2991OooO0O0 = new p061o0000o0O.oo0o0Oo(textView);
    }

    @NonNull
    public final InputFilter[] OooO00o(@NonNull InputFilter[] inputFilterArr) {
        return this.f2991OooO0O0.f34285OooO00o.OooO00o(inputFilterArr);
    }

    public final void OooO0O0(@Nullable AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.f2990OooO00o.getContext().obtainStyledAttributes(attributeSet, p012OooOo0O.o00O0O.AppCompatTextView, i, 0);
        try {
            int i2 = p012OooOo0O.o00O0O.AppCompatTextView_emojiCompatEnabled;
            boolean z = typedArrayObtainStyledAttributes.hasValue(i2) ? typedArrayObtainStyledAttributes.getBoolean(i2, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            OooO0Oo(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void OooO0OO(boolean z) {
        this.f2991OooO0O0.f34285OooO00o.OooO0OO(z);
    }

    public final void OooO0Oo(boolean z) {
        this.f2991OooO0O0.f34285OooO00o.OooO0Oo(z);
    }
}
