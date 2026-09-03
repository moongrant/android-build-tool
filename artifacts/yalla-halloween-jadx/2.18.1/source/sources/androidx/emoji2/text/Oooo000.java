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
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class Oooo000 extends SpannableStringBuilder {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NonNull
    public final Class<?> f8145Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NonNull
    public final List<OooO00o> f8146Oooo0oO;

    public static class OooO00o implements TextWatcher, SpanWatcher {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final Object f8147Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final AtomicInteger f8148Oooo0oO = new AtomicInteger(0);

        public OooO00o(Object obj) {
            this.f8147Oooo0o = obj;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f8147Oooo0o).afterTextChanged(editable);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f8147Oooo0o).beforeTextChanged(charSequence, i, i2, i3);
        }

        @Override // android.text.SpanWatcher
        public final void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
            if (this.f8148Oooo0oO.get() <= 0 || !(obj instanceof OooOOO0)) {
                ((SpanWatcher) this.f8147Oooo0o).onSpanAdded(spannable, obj, i, i2);
            }
        }

        @Override // android.text.SpanWatcher
        public final void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            if (this.f8148Oooo0oO.get() <= 0 || !(obj instanceof OooOOO0)) {
                if (Build.VERSION.SDK_INT < 28) {
                    int i7 = i > i2 ? 0 : i;
                    if (i3 > i4) {
                        i5 = i7;
                        i6 = 0;
                    } else {
                        i6 = i3;
                        i5 = i7;
                    }
                } else {
                    i5 = i;
                    i6 = i3;
                }
                ((SpanWatcher) this.f8147Oooo0o).onSpanChanged(spannable, obj, i5, i2, i6, i4);
            }
        }

        @Override // android.text.SpanWatcher
        public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
            if (this.f8148Oooo0oO.get() <= 0 || !(obj instanceof OooOOO0)) {
                ((SpanWatcher) this.f8147Oooo0o).onSpanRemoved(spannable, obj, i, i2);
            }
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f8147Oooo0o).onTextChanged(charSequence, i, i2, i3);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Oooo000(@NonNull Class<?> cls, @NonNull CharSequence charSequence) {
        super(charSequence);
        this.f8146Oooo0oO = new ArrayList();
        o000OO0O.OooOOO0.OooO0Oo(cls, "watcherClass cannot be null");
        this.f8145Oooo0o = cls;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<androidx.emoji2.text.Oooo000$OooO00o>] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList, java.util.List<androidx.emoji2.text.Oooo000$OooO00o>] */
    public final void OooO00o() {
        for (int i = 0; i < this.f8146Oooo0oO.size(); i++) {
            ((OooO00o) this.f8146Oooo0oO.get(i)).f8148Oooo0oO.incrementAndGet();
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.List<androidx.emoji2.text.Oooo000$OooO00o>] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList, java.util.List<androidx.emoji2.text.Oooo000$OooO00o>] */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void OooO0O0() {
        OooO0o();
        for (int i = 0; i < this.f8146Oooo0oO.size(); i++) {
            ((OooO00o) this.f8146Oooo0oO.get(i)).onTextChanged(this, 0, length(), length());
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<androidx.emoji2.text.Oooo000$OooO00o>] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList, java.util.List<androidx.emoji2.text.Oooo000$OooO00o>] */
    public final OooO00o OooO0OO(Object obj) {
        for (int i = 0; i < this.f8146Oooo0oO.size(); i++) {
            OooO00o oooO00o = (OooO00o) this.f8146Oooo0oO.get(i);
            if (oooO00o.f8147Oooo0o == obj) {
                return oooO00o;
            }
        }
        return null;
    }

    public final boolean OooO0Oo(@NonNull Class<?> cls) {
        return this.f8145Oooo0o == cls;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<androidx.emoji2.text.Oooo000$OooO00o>] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList, java.util.List<androidx.emoji2.text.Oooo000$OooO00o>] */
    public final void OooO0o() {
        for (int i = 0; i < this.f8146Oooo0oO.size(); i++) {
            ((OooO00o) this.f8146Oooo0oO.get(i)).f8148Oooo0oO.decrementAndGet();
        }
    }

    public final boolean OooO0o0(@Nullable Object obj) {
        return obj != null && OooO0Oo(obj.getClass());
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
        if (OooO0o0(obj) && (oooO00oOooO0OO = OooO0OO(obj)) != null) {
            obj = oooO00oOooO0OO;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(@Nullable Object obj) {
        OooO00o oooO00oOooO0OO;
        if (OooO0o0(obj) && (oooO00oOooO0OO = OooO0OO(obj)) != null) {
            obj = oooO00oOooO0OO;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(@Nullable Object obj) {
        OooO00o oooO00oOooO0OO;
        if (OooO0o0(obj) && (oooO00oOooO0OO = OooO0OO(obj)) != null) {
            obj = oooO00oOooO0OO;
        }
        return super.getSpanStart(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    @SuppressLint({"UnknownNullness"})
    public final <T> T[] getSpans(int i, int i2, @NonNull Class<T> cls) {
        if (!OooO0Oo(cls)) {
            return (T[]) super.getSpans(i, i2, cls);
        }
        OooO00o[] oooO00oArr = (OooO00o[]) super.getSpans(i, i2, OooO00o.class);
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, oooO00oArr.length));
        for (int i3 = 0; i3 < oooO00oArr.length; i3++) {
            tArr[i3] = oooO00oArr[i3].f8147Oooo0o;
        }
        return tArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final Editable insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i, int i2, @Nullable Class cls) {
        if (cls == null || OooO0Oo(cls)) {
            cls = OooO00o.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList, java.util.List<androidx.emoji2.text.Oooo000$OooO00o>] */
    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(@Nullable Object obj) {
        OooO00o oooO00oOooO0OO;
        if (OooO0o0(obj)) {
            oooO00oOooO0OO = OooO0OO(obj);
            if (oooO00oOooO0OO != null) {
                obj = oooO00oOooO0OO;
            }
        } else {
            oooO00oOooO0OO = null;
        }
        super.removeSpan(obj);
        if (oooO00oOooO0OO != null) {
            this.f8146Oooo0oO.remove(oooO00oOooO0OO);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence) {
        replace(i, i2, charSequence);
        return this;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList, java.util.List<androidx.emoji2.text.Oooo000$OooO00o>] */
    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(@Nullable Object obj, int i, int i2, int i3) {
        if (OooO0o0(obj)) {
            OooO00o oooO00o = new OooO00o(obj);
            this.f8146Oooo0oO.add(oooO00o);
            obj = oooO00o;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    @SuppressLint({"UnknownNullness"})
    public final CharSequence subSequence(int i, int i2) {
        return new Oooo000(this.f8145Oooo0o, this, i, i2);
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
        OooO0o();
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
    public Oooo000(@NonNull Class<?> cls, @NonNull CharSequence charSequence, int i, int i2) {
        super(charSequence, i, i2);
        this.f8146Oooo0oO = new ArrayList();
        o000OO0O.OooOOO0.OooO0Oo(cls, "watcherClass cannot be null");
        this.f8145Oooo0o = cls;
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
        OooO0o();
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
