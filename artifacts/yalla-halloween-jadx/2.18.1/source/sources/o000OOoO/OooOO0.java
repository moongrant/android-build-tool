package o000OOoO;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.emoji2.text.EmojiCompat;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0O0 f28303OooO00o;

    @RequiresApi(19)
    public static class OooO00o extends OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final TextView f28304OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final OooO0o f28305OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f28306OooO0OO = true;

        public OooO00o(TextView textView) {
            this.f28304OooO00o = textView;
            this.f28305OooO0O0 = new OooO0o(textView);
        }

        @Override // o000OOoO.OooOO0.OooO0O0
        @NonNull
        public final InputFilter[] OooO00o(@NonNull InputFilter[] inputFilterArr) {
            if (this.f28306OooO0OO) {
                int length = inputFilterArr.length;
                for (InputFilter inputFilter : inputFilterArr) {
                    if (inputFilter == this.f28305OooO0O0) {
                        return inputFilterArr;
                    }
                }
                InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
                inputFilterArr2[length] = this.f28305OooO0O0;
                return inputFilterArr2;
            }
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                if (inputFilterArr[i] instanceof OooO0o) {
                    sparseArray.put(i, inputFilterArr[i]);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length2 = inputFilterArr.length;
            InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < length2; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr3[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr3;
        }

        @Override // o000OOoO.OooOO0.OooO0O0
        public final boolean OooO0O0() {
            return this.f28306OooO0OO;
        }

        @Override // o000OOoO.OooOO0.OooO0O0
        public final void OooO0OO(boolean z) {
            if (z) {
                this.f28304OooO00o.setTransformationMethod(OooO0o0(this.f28304OooO00o.getTransformationMethod()));
            }
        }

        @Override // o000OOoO.OooOO0.OooO0O0
        public final void OooO0Oo(boolean z) {
            this.f28306OooO0OO = z;
            this.f28304OooO00o.setTransformationMethod(OooO0o0(this.f28304OooO00o.getTransformationMethod()));
            this.f28304OooO00o.setFilters(OooO00o(this.f28304OooO00o.getFilters()));
        }

        @Override // o000OOoO.OooOO0.OooO0O0
        @Nullable
        public final TransformationMethod OooO0o0(@Nullable TransformationMethod transformationMethod) {
            if (this.f28306OooO0OO) {
                return ((transformationMethod instanceof OooOOO0) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new OooOOO0(transformationMethod);
            }
            return transformationMethod instanceof OooOOO0 ? ((OooOOO0) transformationMethod).f28313Oooo0o : transformationMethod;
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
        public final OooO00o f28307OooO00o;

        public OooO0OO(TextView textView) {
            this.f28307OooO00o = new OooO00o(textView);
        }

        @Override // o000OOoO.OooOO0.OooO0O0
        @NonNull
        public final InputFilter[] OooO00o(@NonNull InputFilter[] inputFilterArr) {
            return OooO0o() ? inputFilterArr : this.f28307OooO00o.OooO00o(inputFilterArr);
        }

        @Override // o000OOoO.OooOO0.OooO0O0
        public final boolean OooO0O0() {
            return this.f28307OooO00o.f28306OooO0OO;
        }

        @Override // o000OOoO.OooOO0.OooO0O0
        public final void OooO0OO(boolean z) {
            if (OooO0o()) {
                return;
            }
            OooO00o oooO00o = this.f28307OooO00o;
            Objects.requireNonNull(oooO00o);
            if (z) {
                oooO00o.f28304OooO00o.setTransformationMethod(oooO00o.OooO0o0(oooO00o.f28304OooO00o.getTransformationMethod()));
            }
        }

        @Override // o000OOoO.OooOO0.OooO0O0
        public final void OooO0Oo(boolean z) {
            if (OooO0o()) {
                this.f28307OooO00o.f28306OooO0OO = z;
            } else {
                this.f28307OooO00o.OooO0Oo(z);
            }
        }

        public final boolean OooO0o() {
            return !EmojiCompat.OooO0OO();
        }

        @Override // o000OOoO.OooOO0.OooO0O0
        @Nullable
        public final TransformationMethod OooO0o0(@Nullable TransformationMethod transformationMethod) {
            return OooO0o() ? transformationMethod : this.f28307OooO00o.OooO0o0(transformationMethod);
        }
    }

    public OooOO0(@NonNull TextView textView) {
        o000OO0O.OooOOO0.OooO0Oo(textView, "textView cannot be null");
        this.f28303OooO00o = new OooO0OO(textView);
    }
}
