package p061o0000o0O;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.emoji2.text.EmojiCompat;
import o000OO.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
public final class oo0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0O0 f34285OooO00o;

    @RequiresApi(19)
    public static class OooO00o extends OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final TextView f34286OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o0Oo0oo f34287OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f34288OooO0OO = true;

        public OooO00o(TextView textView) {
            this.f34286OooO00o = textView;
            this.f34287OooO0O0 = new o0Oo0oo(textView);
        }

        @Override // o0000o0O.oo0o0Oo.OooO0O0
        @NonNull
        public final InputFilter[] OooO00o(@NonNull InputFilter[] inputFilterArr) {
            if (!this.f34288OooO0OO) {
                SparseArray sparseArray = new SparseArray(1);
                for (int i = 0; i < inputFilterArr.length; i++) {
                    InputFilter inputFilter = inputFilterArr[i];
                    if (inputFilter instanceof o0Oo0oo) {
                        sparseArray.put(i, inputFilter);
                    }
                }
                if (sparseArray.size() == 0) {
                    return inputFilterArr;
                }
                int length = inputFilterArr.length;
                InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
                int i2 = 0;
                for (int i3 = 0; i3 < length; i3++) {
                    if (sparseArray.indexOfKey(i3) < 0) {
                        inputFilterArr2[i2] = inputFilterArr[i3];
                        i2++;
                    }
                }
                return inputFilterArr2;
            }
            int length2 = inputFilterArr.length;
            int i4 = 0;
            while (true) {
                o0Oo0oo o0oo0oo2 = this.f34287OooO0O0;
                if (i4 >= length2) {
                    InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                    System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                    inputFilterArr3[length2] = o0oo0oo2;
                    return inputFilterArr3;
                }
                if (inputFilterArr[i4] == o0oo0oo2) {
                    return inputFilterArr;
                }
                i4++;
            }
        }

        @Override // o0000o0O.oo0o0Oo.OooO0O0
        public final boolean OooO0O0() {
            return this.f34288OooO0OO;
        }

        @Override // o0000o0O.oo0o0Oo.OooO0O0
        public final void OooO0OO(boolean z) {
            if (z) {
                TextView textView = this.f34286OooO00o;
                textView.setTransformationMethod(OooO0o0(textView.getTransformationMethod()));
            }
        }

        @Override // o0000o0O.oo0o0Oo.OooO0O0
        public final void OooO0Oo(boolean z) {
            this.f34288OooO0OO = z;
            TextView textView = this.f34286OooO00o;
            textView.setTransformationMethod(OooO0o0(textView.getTransformationMethod()));
            textView.setFilters(OooO00o(textView.getFilters()));
        }

        @Override // o0000o0O.oo0o0Oo.OooO0O0
        @Nullable
        public final TransformationMethod OooO0o0(@Nullable TransformationMethod transformationMethod) {
            if (this.f34288OooO0OO) {
                return ((transformationMethod instanceof o000OOo) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new o000OOo(transformationMethod);
            }
            return transformationMethod instanceof o000OOo ? ((o000OOo) transformationMethod).f34265OooO00o : transformationMethod;
        }
    }

    public static class OooO0O0 {
        @NonNull
        public InputFilter[] OooO00o(@NonNull InputFilter[] inputFilterArr) {
            throw null;
        }

        public boolean OooO0O0() {
            throw null;
        }

        public void OooO0OO(boolean z) {
            throw null;
        }

        public void OooO0Oo(boolean z) {
            throw null;
        }

        @Nullable
        public TransformationMethod OooO0o0(@Nullable TransformationMethod transformationMethod) {
            throw null;
        }
    }

    @RequiresApi(19)
    public static class OooO0OO extends OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO00o f34289OooO00o;

        public OooO0OO(TextView textView) {
            this.f34289OooO00o = new OooO00o(textView);
        }

        @Override // o0000o0O.oo0o0Oo.OooO0O0
        @NonNull
        public final InputFilter[] OooO00o(@NonNull InputFilter[] inputFilterArr) {
            return EmojiCompat.OooO0OO() ^ true ? inputFilterArr : this.f34289OooO00o.OooO00o(inputFilterArr);
        }

        @Override // o0000o0O.oo0o0Oo.OooO0O0
        public final boolean OooO0O0() {
            return this.f34289OooO00o.f34288OooO0OO;
        }

        @Override // o0000o0O.oo0o0Oo.OooO0O0
        public final void OooO0OO(boolean z) {
            if (!EmojiCompat.OooO0OO()) {
                return;
            }
            this.f34289OooO00o.OooO0OO(z);
        }

        @Override // o0000o0O.oo0o0Oo.OooO0O0
        public final void OooO0Oo(boolean z) {
            boolean z2 = !EmojiCompat.OooO0OO();
            OooO00o oooO00o = this.f34289OooO00o;
            if (z2) {
                oooO00o.f34288OooO0OO = z;
            } else {
                oooO00o.OooO0Oo(z);
            }
        }

        @Override // o0000o0O.oo0o0Oo.OooO0O0
        @Nullable
        public final TransformationMethod OooO0o0(@Nullable TransformationMethod transformationMethod) {
            return EmojiCompat.OooO0OO() ^ true ? transformationMethod : this.f34289OooO00o.OooO0o0(transformationMethod);
        }
    }

    public oo0o0Oo(@NonNull TextView textView) {
        OooOOO0.OooO0o0(textView, "textView cannot be null");
        this.f34285OooO00o = new OooO0OO(textView);
    }
}
