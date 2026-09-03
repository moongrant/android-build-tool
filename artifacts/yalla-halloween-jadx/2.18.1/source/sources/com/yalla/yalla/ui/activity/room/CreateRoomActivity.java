package com.yalla.yalla.ui.activity.room;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelProvider;
import com.app.base.base.activity.BaseActivity;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.vm.CreateRoomVM;
import com.yalla.yalla.ui.activity.room.CreateRoomActivity;
import com.yalla.yalla.util.netimage.NetImageView;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153o00Oo0oO.o00000OO;
import p153o00Oo0oO.o0ooOOo;
import p153o00Oo0oO.oo0o0Oo;
import p160o00OoOO0.o00OO0O0;
import p254o00ooO0O.oOO00O;
import p391o0OOooOo.o0O00000;
import p438o0OoOOo.o000Oo0;
import p470o0Oooo0.o00;
import p487o0o000oO.o00oO0o;
import p516o0o0O000.o000oOoO;
import p522o0o0O0o.o00O0OO;
import p522o0o0O0o.oo0oOO0;
import p544o0o0OoOO.d3;
import p544o0o0OoOO.j3;
import p544o0o0OoOO.k3;
import p544o0o0OoOO.l3;
import p544o0o0OoOO.m3;
import p544o0o0OoOO.n3;
import p616o0oo0Ooo.oO0O00;
import p618o0oo0o0.o0O0O00;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/ui/activity/room/CreateRoomActivity;", "Lcom/app/base/base/activity/BaseActivity;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class CreateRoomActivity extends BaseActivity {

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    @NotNull
    public static final OooO00o f22774Ooooooo = new OooO00o();

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public NetImageView f22775OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public EditText f22776OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public TextView f22777OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public ImageView f22778Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public EditText f22779Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public TextView f22780OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public ImageView f22781OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public Button f22782OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public boolean f22783Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public CreateRoomVM f22784Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    @Nullable
    public String f22785OoooooO = String.valueOf(p498o0o00Oo0.OooOOO.f41216OooO00o.OooO0oo().getValue());

    public static final class OooO00o {
        public final void OooO00o(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            context.startActivity(new Intent(context, (Class<?>) CreateRoomActivity.class));
        }
    }

    public final void OooOoO() {
        EditText editText = this.f22776OoooOoO;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etRoomName");
            editText = null;
        }
        Editable text = editText.getText();
        if (text == null || StringsKt.isBlank(text)) {
            return;
        }
        EditText editText2 = this.f22779Ooooo0o;
        if (editText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etRoomAnno");
            editText2 = null;
        }
        Editable text2 = editText2.getText();
        if (text2 == null || StringsKt.isBlank(text2)) {
            return;
        }
        String str = this.f22785OoooooO;
        if (str == null || StringsKt.isBlank(str)) {
            return;
        }
        EditText editText3 = this.f22776OoooOoO;
        if (editText3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etRoomName");
            editText3 = null;
        }
        String string = editText3.getText().toString();
        String str2 = this.f22785OoooooO;
        Intrinsics.checkNotNull(str2);
        EditText editText4 = this.f22779Ooooo0o;
        if (editText4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etRoomAnno");
            editText4 = null;
        }
        String string2 = editText4.getText().toString();
        if (this.f22783Oooooo) {
            return;
        }
        this.f22783Oooooo = true;
        o0O00000.OooO0OO("Room_create_create");
        o00oO0o o00oo0o2 = o00oO0o.f40931OooO00o;
        String strRemovePrefix = StringsKt.removePrefix(str2, (CharSequence) o00oO0o.f40934OooO0Oo);
        p153o00Oo0oO.o00oO0o o00oo0o3 = o00000OO.f32207OooO00o;
        oo0o0Oo oo0o0oo = o00000OO.f32210OooO0Oo;
        k3 k3Var = new k3(this);
        Map<String, String> mapOooO0O0 = o00OO0O0.OooO0O0();
        mapOooO0O0.put("barimage", strRemovePrefix);
        mapOooO0O0.put("barname", o000oOoO.OooO0O0(string));
        mapOooO0O0.put("notice", o000oOoO.OooO0O0(string2));
        mapOooO0O0.put("type", "1");
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0OO(null, o0ooOOo.f32244OooOoo, o0ooOOo.f32277Ooooooo, mapOooO0O0, k3Var);
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, o00Oo00.OooO00o
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        Button button = this.f22782OooooOo;
        if (button == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btCreate");
            button = null;
        }
        if (Intrinsics.areEqual(view, button)) {
            OooOoO();
            return;
        }
        NetImageView netImageView = this.f22775OoooOo0;
        if (netImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nivRoomHeader");
            netImageView = null;
        }
        if (Intrinsics.areEqual(view, netImageView)) {
            o0O0O00.OooO0OO(this, p618o0oo0o0.oo0o0Oo.f48607OooO0O0, null, new j3(this));
        }
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_create_room);
        this.f22784Oooooo0 = (CreateRoomVM) new ViewModelProvider(this).get(CreateRoomVM.class);
        View viewFindViewById = findViewById(R.id.nivRoomHeader);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.nivRoomHeader)");
        this.f22775OoooOo0 = (NetImageView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.etRoomName);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(R.id.etRoomName)");
        this.f22776OoooOoO = (EditText) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.tvRoomNameNum);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(R.id.tvRoomNameNum)");
        this.f22777OoooOoo = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.ivRoomNameClear);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(R.id.ivRoomNameClear)");
        this.f22778Ooooo00 = (ImageView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.etRoomAnno);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(R.id.etRoomAnno)");
        this.f22779Ooooo0o = (EditText) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.tvRoomAnnoNum);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(R.id.tvRoomAnnoNum)");
        this.f22780OooooO0 = (TextView) viewFindViewById6;
        View viewFindViewById7 = findViewById(R.id.ivRoomAnnoClear);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(R.id.ivRoomAnnoClear)");
        this.f22781OooooOO = (ImageView) viewFindViewById7;
        View viewFindViewById8 = findViewById(R.id.btCreateRoom);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(R.id.btCreateRoom)");
        this.f22782OooooOo = (Button) viewFindViewById8;
        OooOo(R.string.Creat_Room);
        NetImageView netImageView = this.f22775OoooOo0;
        EditText editText = null;
        if (netImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nivRoomHeader");
            netImageView = null;
        }
        netImageView.setOnClickListener(this);
        EditText editText2 = this.f22776OoooOoO;
        if (editText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etRoomName");
            editText2 = null;
        }
        editText2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o0o0OoOO.e3
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                CreateRoomActivity this$0 = this.f44227Oooo0o;
                CreateRoomActivity.OooO00o oooO00o = CreateRoomActivity.f22774Ooooooo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ImageView imageView = null;
                if (z) {
                    TextView textView = this$0.f22777OoooOoo;
                    if (textView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("tvRoomNameNum");
                        textView = null;
                    }
                    oOO00O.OooO(textView);
                    ImageView imageView2 = this$0.f22778Ooooo00;
                    if (imageView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("ivRoomNameClear");
                    } else {
                        imageView = imageView2;
                    }
                    oOO00O.OooO(imageView);
                    return;
                }
                TextView textView2 = this$0.f22777OoooOoo;
                if (textView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tvRoomNameNum");
                    textView2 = null;
                }
                oOO00O.OooO00o(textView2);
                ImageView imageView3 = this$0.f22778Ooooo00;
                if (imageView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("ivRoomNameClear");
                } else {
                    imageView = imageView3;
                }
                oOO00O.OooO00o(imageView);
            }
        });
        EditText editText3 = this.f22779Ooooo0o;
        if (editText3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etRoomAnno");
            editText3 = null;
        }
        editText3.setImeOptions(6);
        EditText editText4 = this.f22779Ooooo0o;
        if (editText4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etRoomAnno");
            editText4 = null;
        }
        editText4.setRawInputType(1);
        EditText editText5 = this.f22779Ooooo0o;
        if (editText5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etRoomAnno");
            editText5 = null;
        }
        editText5.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o0o0OoOO.f3
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                CreateRoomActivity this$0 = this.f44232Oooo0o;
                CreateRoomActivity.OooO00o oooO00o = CreateRoomActivity.f22774Ooooooo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ImageView imageView = null;
                if (z) {
                    TextView textView = this$0.f22780OooooO0;
                    if (textView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("tvRoomAnnoNum");
                        textView = null;
                    }
                    oOO00O.OooO(textView);
                    ImageView imageView2 = this$0.f22781OooooOO;
                    if (imageView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("ivRoomAnnoClear");
                    } else {
                        imageView = imageView2;
                    }
                    oOO00O.OooO(imageView);
                    return;
                }
                TextView textView2 = this$0.f22780OooooO0;
                if (textView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tvRoomAnnoNum");
                    textView2 = null;
                }
                oOO00O.OooO00o(textView2);
                ImageView imageView3 = this$0.f22781OooooOO;
                if (imageView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("ivRoomAnnoClear");
                } else {
                    imageView = imageView3;
                }
                oOO00O.OooO00o(imageView);
            }
        });
        EditText editText6 = this.f22776OoooOoO;
        if (editText6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etRoomName");
            editText6 = null;
        }
        editText6.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o0o0OoOO.g3
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                CreateRoomActivity this$0 = this.f44237OooO00o;
                CreateRoomActivity.OooO00o oooO00o = CreateRoomActivity.f22774Ooooooo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (i != 5) {
                    return false;
                }
                EditText editText7 = this$0.f22779Ooooo0o;
                if (editText7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("etRoomAnno");
                    editText7 = null;
                }
                editText7.requestFocus();
                return true;
            }
        });
        EditText editText7 = this.f22779Ooooo0o;
        if (editText7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etRoomAnno");
            editText7 = null;
        }
        editText7.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o0o0OoOO.h3
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                CreateRoomActivity this$0 = this.f44242OooO00o;
                CreateRoomActivity.OooO00o oooO00o = CreateRoomActivity.f22774Ooooooo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (i != 6) {
                    return false;
                }
                this$0.OooOoO();
                return false;
            }
        });
        new o00(this).f40619OooO0o0 = new l3(this);
        ImageView imageView = this.f22778Ooooo00;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivRoomNameClear");
            imageView = null;
        }
        imageView.setOnClickListener(new o000Oo0(this, 1));
        ImageView imageView2 = this.f22781OooooOO;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivRoomAnnoClear");
            imageView2 = null;
        }
        imageView2.setOnClickListener(new d3(this, 0));
        EditText editText8 = this.f22776OoooOoO;
        if (editText8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etRoomName");
            editText8 = null;
        }
        o00O0OO o00o0oo2 = new o00O0OO();
        m3 listener = new m3(this);
        Intrinsics.checkNotNullParameter(listener, "listener");
        o00o0oo2.f43011Oooo0oO = listener;
        editText8.addTextChangedListener(o00o0oo2);
        EditText editText9 = this.f22779Ooooo0o;
        if (editText9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etRoomAnno");
            editText9 = null;
        }
        o00O0OO o00o0oo3 = new o00O0OO();
        n3 listener2 = new n3(this);
        Intrinsics.checkNotNullParameter(listener2, "listener");
        o00o0oo3.f43011Oooo0oO = listener2;
        editText9.addTextChangedListener(o00o0oo3);
        Button button = this.f22782OooooOo;
        if (button == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btCreate");
            button = null;
        }
        button.setOnClickListener(this);
        oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(this);
        p498o0o00Oo0.OooOOO oooOOO = p498o0o00Oo0.OooOOO.f41216OooO00o;
        oooO00o.f48429OooO0OO = oooOOO.OooO0oo().getValue();
        oooO00o.f48427OooO00o = 0;
        oooO00o.OooO0oO(oo0oOO0.OooO00o(6.0f));
        oooO00o.f48431OooO0o = R.drawable.icon_head_default;
        oooO00o.f48441OooOOOo = R.drawable.icon_head_default;
        NetImageView netImageView2 = this.f22775OoooOo0;
        if (netImageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nivRoomHeader");
            netImageView2 = null;
        }
        oooO00o.OooO0o(netImageView2);
        EditText editText10 = this.f22776OoooOoO;
        if (editText10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etRoomName");
            editText10 = null;
        }
        editText10.setText(oooOOO.OooOoO().getValue());
        EditText editText11 = this.f22779Ooooo0o;
        if (editText11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etRoomAnno");
        } else {
            editText = editText11;
        }
        editText.setText(R.string.Creat_Room_Anno);
    }
}
