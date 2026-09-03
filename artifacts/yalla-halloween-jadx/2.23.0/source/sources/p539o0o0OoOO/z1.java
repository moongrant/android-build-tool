package p539o0o0OoOO;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.yalla.yalla.ui.view.PickerView;

/* JADX INFO: loaded from: classes5.dex */
public final class z1 extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PickerView f55765OooO0Oo;

    public z1(PickerView pickerView) {
        this.f55765OooO0Oo = pickerView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        int i;
        PickerView pickerView = this.f55765OooO0Oo;
        int i2 = pickerView.f30559OooOOo0 - (pickerView.f30564OooOo0O * pickerView.f30548OooO0o0);
        int i3 = pickerView.f30558OooOOo;
        if (i2 <= i3 || i2 >= (i = pickerView.f30560OooOOoo)) {
            pickerView.OooO0Oo(1000);
            return true;
        }
        pickerView.f30551OooOO0.fling(0, i2, 0, (int) f2, 0, 0, i3, i, 0, pickerView.f30563OooOo00);
        pickerView.f30557OooOOOo = pickerView.f30551OooOO0.getCurrY();
        pickerView.f30553OooOO0o = true;
        return true;
    }
}
