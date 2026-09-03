package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final TextView f5095OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final o000OOoO.OooOO0 f5096OooO0O0;

    public OooOOO(@NonNull TextView textView) {
        this.f5095OooO00o = textView;
        this.f5096OooO0O0 = new o000OOoO.OooOO0(textView);
    }

    @NonNull
    public final InputFilter[] OooO00o(@NonNull InputFilter[] inputFilterArr) {
        return this.f5096OooO0O0.f28303OooO00o.OooO00o(inputFilterArr);
    }

    public final void OooO0O0(@Nullable AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.f5095OooO00o.getContext().obtainStyledAttributes(attributeSet, OooOo00.OooOOOO.AppCompatTextView, i, 0);
        try {
            int i2 = OooOo00.OooOOOO.AppCompatTextView_emojiCompatEnabled;
            boolean z = typedArrayObtainStyledAttributes.hasValue(i2) ? typedArrayObtainStyledAttributes.getBoolean(i2, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            OooO0Oo(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void OooO0OO(boolean z) {
        this.f5096OooO0O0.f28303OooO00o.OooO0OO(z);
    }

    public final void OooO0Oo(boolean z) {
        this.f5096OooO0O0.f28303OooO00o.OooO0Oo(z);
    }
}
