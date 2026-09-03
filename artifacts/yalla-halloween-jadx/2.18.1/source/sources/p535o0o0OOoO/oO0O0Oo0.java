package p535o0o0OOoO;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ImageView;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.main.MainSearchActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.oOO00O;

/* JADX INFO: loaded from: classes2.dex */
public final class oO0O0Oo0 implements TextWatcher {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MainSearchActivity f43663Oooo0o;

    public oO0O0Oo0(MainSearchActivity mainSearchActivity) {
        this.f43663Oooo0o = mainSearchActivity;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(@Nullable Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        if (!StringsKt.isBlank(StringsKt.trim((CharSequence) String.valueOf(charSequence)).toString())) {
            MainSearchActivity mainSearchActivity = this.f43663Oooo0o;
            MainSearchActivity.OooO00o oooO00o = MainSearchActivity.f21967Oooooo0;
            ImageView imageView = mainSearchActivity.OooOoo().f49735OooO0OO;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivDelete");
            oOO00O.OooO(imageView);
            this.f43663Oooo0o.OooOoo().f49738OooO0o0.setTextColor(o000O0O0.OooO00o(R.color.color_white));
            return;
        }
        MainSearchActivity mainSearchActivity2 = this.f43663Oooo0o;
        MainSearchActivity.OooO00o oooO00o2 = MainSearchActivity.f21967Oooooo0;
        ImageView imageView2 = mainSearchActivity2.OooOoo().f49735OooO0OO;
        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivDelete");
        oOO00O.OooO00o(imageView2);
        this.f43663Oooo0o.OooOoo().f49738OooO0o0.setTextColor(o000O0O0.OooO00o(R.color.color_white_70));
        this.f43663Oooo0o.OooOooO().getSearchText().setValue("");
    }
}
