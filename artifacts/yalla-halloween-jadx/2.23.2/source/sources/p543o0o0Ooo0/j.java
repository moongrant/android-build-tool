package p543o0o0Ooo0;

import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import com.yalla.yalla.ui.screen.user.MyUserInfoScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends Lambda implements Function2<IntOffset, IntSize, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final j f55448OooO0Oo = new j();

    public j() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(IntOffset intOffset, IntSize intSize) {
        long packedValue = intOffset.getPackedValue();
        long packedValue2 = intSize.getPackedValue();
        MyUserInfoScreen myUserInfoScreen = MyUserInfoScreen.INSTANCE;
        myUserInfoScreen.m4206setLanguageLocationgyyYBs(packedValue);
        myUserInfoScreen.m4207setLanguageSizeozmzZPI(packedValue2);
        return Unit.INSTANCE;
    }
}
