package p508o0o00oOo;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.yalla.yalla.common.ui.view.PickerView;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000OO0 extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ PickerView f41819OooO00o;

    public o0000OO0(PickerView pickerView) {
        this.f41819OooO00o = pickerView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        int i;
        PickerView pickerView = this.f41819OooO00o;
        int i2 = pickerView.f20973OoooOoO - (pickerView.f20978OooooOO * pickerView.f20963Oooo0oO);
        int i3 = pickerView.f20974OoooOoo;
        if (i2 <= i3 || i2 >= (i = pickerView.f20975Ooooo00)) {
            pickerView.OooO0Oo(1000);
            return true;
        }
        pickerView.f20968OoooO0O.fling(0, i2, 0, (int) f2, 0, 0, i3, i, 0, pickerView.f20976Ooooo0o);
        PickerView pickerView2 = this.f41819OooO00o;
        pickerView2.f20972OoooOo0 = pickerView2.f20968OoooO0O.getCurrY();
        this.f41819OooO00o.f20969OoooOO0 = true;
        return true;
    }
}
