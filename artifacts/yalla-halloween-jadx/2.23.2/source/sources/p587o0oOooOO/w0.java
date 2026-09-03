package p587o0oOooOO;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.yalla.yalla.ui.view.PickerView;

/* JADX INFO: loaded from: classes4.dex */
public final class w0 extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PickerView f57005OooO0Oo;

    public w0(PickerView pickerView) {
        this.f57005OooO0Oo = pickerView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        int i;
        PickerView pickerView = this.f57005OooO0Oo;
        int i2 = pickerView.f30014OooOOo0 - (pickerView.f30019OooOo0O * pickerView.f30003OooO0o0);
        int i3 = pickerView.f30013OooOOo;
        if (i2 <= i3 || i2 >= (i = pickerView.f30015OooOOoo)) {
            pickerView.OooO0Oo(1000);
            return true;
        }
        pickerView.f30006OooOO0.fling(0, i2, 0, (int) f2, 0, 0, i3, i, 0, pickerView.f30018OooOo00);
        pickerView.f30012OooOOOo = pickerView.f30006OooOO0.getCurrY();
        pickerView.f30008OooOO0o = true;
        return true;
    }
}
