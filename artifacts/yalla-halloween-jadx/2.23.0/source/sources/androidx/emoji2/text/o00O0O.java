package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o00O0O extends SpannableStringBuilder {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final Class<?> f5652OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ArrayList f5653OooO0o0;

    public static class OooO00o implements TextWatcher, SpanWatcher {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Object f5654OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final AtomicInteger f5655OooO0o0 = new AtomicInteger(0);

        public OooO00o(Object obj) {
            this.f5654OooO0Oo = obj;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f5654OooO0Oo).afterTextChanged(editable);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f5654OooO0Oo).beforeTextChanged(charSequence, i, i2, i3);
        }

        @Override // android.text.SpanWatcher
        public final void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
            if (this.f5655OooO0o0.get() <= 0 || !(obj instanceof OooOo)) {
                ((SpanWatcher) this.f5654OooO0Oo).onSpanAdded(spannable, obj, i, i2);
            }
        }

        /* JADX WARN: Code duplicated, block: B:14:0x001c A[PHI: r11
          0x001c: PHI (r11v1 int) = (r11v0 int), (r11v3 int) binds: [B:8:0x0011, B:12:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // android.text.SpanWatcher
        public final void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            if (this.f5655OooO0o0.get() <= 0 || !(obj instanceof OooOo)) {
                if (Build.VERSION.SDK_INT >= 28) {
                    i5 = i;
                    i6 = i3;
                } else {
                    if (i > i2) {
                        i = 0;
                    }
                    if (i3 > i4) {
                        i5 = i;
                        i6 = 0;
                    } else {
                        i5 = i;
                        i6 = i3;
                    }
                }
                ((SpanWatcher) this.f5654OooO0Oo).onSpanChanged(spannable, obj, i5, i2, i6, i4);
            }
        }

        @Override // android.text.SpanWatcher
        public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
            if (this.f5655OooO0o0.get() <= 0 || !(obj instanceof OooOo)) {
                ((SpanWatcher) this.f5654OooO0Oo).onSpanRemoved(spannable, obj, i, i2);
            }
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f5654OooO0Oo).onTextChanged(charSequence, i, i2, i3);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public o00O0O(@NonNull CharSequence charSequence, @NonNull Class cls) {
        super(charSequence);
        this.f5653OooO0o0 = new ArrayList();
        o000OO.OooOOO0.OooO0o0(cls, "watcherClass cannot be null");
        this.f5652OooO0Oo = cls;
    }

    public final void OooO00o() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f5653OooO0o0;
            if (i >= arrayList.size()) {
                return;
            }
            ((OooO00o) arrayList.get(i)).f5655OooO0o0.incrementAndGet();
            i++;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void OooO0O0() {
        OooO0o0();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f5653OooO0o0;
            if (i >= arrayList.size()) {
                return;
            }
            ((OooO00o) arrayList.get(i)).onTextChanged(this, 0, length(), length());
            i++;
        }
    }

    public final OooO00o OooO0OO(Object obj) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f5653OooO0o0;
            if (i >= arrayList.size()) {
                return null;
            }
            OooO00o oooO00o = (OooO00o) arrayList.get(i);
            if (oooO00o.f5654OooO0Oo == obj) {
                return oooO00o;
            }
            i++;
        }
    }

    public final boolean OooO0Oo(@Nullable Object obj) {
        if (obj != null) {
            return this.f5652OooO0Oo == obj.getClass();
        }
        return false;
    }

    public final void OooO0o0() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f5653OooO0o0;
            if (i >= arrayList.size()) {
                return;
            }
            ((OooO00o) arrayList.get(i)).f5655OooO0o0.decrementAndGet();
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @NonNull
    public final Editable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final Editable delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(@Nullable Object obj) {
        OooO00o oooO00oOooO0OO;
        if (OooO0Oo(obj) && (oooO00oOooO0OO = OooO0OO(obj)) != null) {
            obj = oooO00oOooO0OO;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(@Nullable Object obj) {
        OooO00o oooO00oOooO0OO;
        if (OooO0Oo(obj) && (oooO00oOooO0OO = OooO0OO(obj)) != null) {
            obj = oooO00oOooO0OO;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(@Nullable Object obj) {
        OooO00o oooO00oOooO0OO;
        if (OooO0Oo(obj) && (oooO00oOooO0OO = OooO0OO(obj)) != null) {
            obj = oooO00oOooO0OO;
        }
        return super.getSpanStart(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    @SuppressLint({"UnknownNullness"})
    public final <T> T[] getSpans(int i, int i2, @NonNull Class<T> cls) {
        if (!(this.f5652OooO0Oo == cls)) {
            return (T[]) super.getSpans(i, i2, cls);
        }
        OooO00o[] oooO00oArr = (OooO00o[]) super.getSpans(i, i2, OooO00o.class);
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, oooO00oArr.length));
        for (int i3 = 0; i3 < oooO00oArr.length; i3++) {
            tArr[i3] = oooO00oArr[i3].f5654OooO0Oo;
        }
        return tArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final Editable insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x000b  */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i, int i2, @Nullable Class cls) {
        if (cls == null) {
            cls = OooO00o.class;
        } else {
            if (this.f5652OooO0Oo == cls) {
                cls = OooO00o.class;
            }
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(@Nullable Object obj) {
        OooO00o oooO00oOooO0OO;
        if (OooO0Oo(obj)) {
            oooO00oOooO0OO = OooO0OO(obj);
            if (oooO00oOooO0OO != null) {
                obj = oooO00oOooO0OO;
            }
        } else {
            oooO00oOooO0OO = null;
        }
        super.removeSpan(obj);
        if (oooO00oOooO0OO != null) {
            this.f5653OooO0o0.remove(oooO00oOooO0OO);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence) {
        replace(i, i2, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(@Nullable Object obj, int i, int i2, int i3) {
        if (OooO0Oo(obj)) {
            OooO00o oooO00o = new OooO00o(obj);
            this.f5653OooO0o0.add(oooO00o);
            obj = oooO00o;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    @SuppressLint({"UnknownNullness"})
    public final CharSequence subSequence(int i, int i2) {
        return new o00O0O(this.f5652OooO0Oo, this, i, i2);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @NonNull
    public final SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        replace(i, i2, charSequence, i3, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @NonNull
    public final Appendable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) throws IOException {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final Editable insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        OooO00o();
        super.replace(i, i2, charSequence);
        OooO0o0();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @NonNull
    public final Editable append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public o00O0O(@NonNull Class<?> cls, @NonNull CharSequence charSequence, int i, int i2) {
        super(charSequence, i, i2);
        this.f5653OooO0o0 = new ArrayList();
        o000OO.OooOOO0.OooO0o0(cls, "watcherClass cannot be null");
        this.f5652OooO0Oo = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @NonNull
    public final SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @NonNull
    public final Appendable append(char c) throws IOException {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        OooO00o();
        super.replace(i, i2, charSequence, i3, i4);
        OooO0o0();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @NonNull
    public final Editable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @NonNull
    public final SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @NonNull
    public final Appendable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2) throws IOException {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }
}
