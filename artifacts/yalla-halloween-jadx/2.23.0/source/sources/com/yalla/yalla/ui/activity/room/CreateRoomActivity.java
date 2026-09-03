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
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import com.yalla.yalla.ui.vm.CreateRoomVM;
import com.yalla.yalla.util.permission.PermissionGroupReveal;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p579o0oOoo.oO000Oo0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p640o0ooOOO0.oO00o000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/ui/activity/room/CreateRoomActivity;", "Lcom/yalla/yalla/base/activity/BaseFragmentActivity;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCreateRoomActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateRoomActivity.kt\ncom/yalla/yalla/ui/activity/room/CreateRoomActivity\n+ 2 TextViewExt.kt\ncom/yalla/yalla/ext/TextViewExtKt\n*L\n1#1,282:1\n160#2,2:283\n160#2,2:285\n*S KotlinDebug\n*F\n+ 1 CreateRoomActivity.kt\ncom/yalla/yalla/ui/activity/room/CreateRoomActivity\n*L\n130#1:283,2\n138#1:285,2\n*E\n"})
public final class CreateRoomActivity extends BaseFragmentActivity {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final /* synthetic */ int f26502OooOoo0 = 0;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public EditText f26503OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public NetImageView f26504OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public TextView f26505OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Button f26506OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public EditText f26507OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public ImageView f26508OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public TextView f26509OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public ImageView f26510OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f26511OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public CreateRoomVM f26512OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @Nullable
    public String f26513OooOoOO;

    public static final class OooO00o {
        public static void OooO00o(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            context.startActivity(new Intent(context, (Class<?>) CreateRoomActivity.class));
        }
    }

    public CreateRoomActivity() {
        p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
        this.f26513OooOoOO = String.valueOf(p464o0Oooo.o000000O.OooO().getValue());
    }

    public final void OooOo0() {
        EditText editText = this.f26503OooOOo;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etRoomName");
            editText = null;
        }
        Editable text = editText.getText();
        if (text == null || StringsKt.isBlank(text)) {
            return;
        }
        EditText editText2 = this.f26507OooOo0;
        if (editText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etRoomAnno");
            editText2 = null;
        }
        Editable text2 = editText2.getText();
        if (text2 == null || StringsKt.isBlank(text2)) {
            return;
        }
        String str = this.f26513OooOoOO;
        if (str == null || StringsKt.isBlank(str)) {
            return;
        }
        EditText editText3 = this.f26503OooOOo;
        if (editText3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etRoomName");
            editText3 = null;
        }
        String string = editText3.getText().toString();
        String str2 = this.f26513OooOoOO;
        Intrinsics.checkNotNull(str2);
        EditText editText4 = this.f26507OooOo0;
        if (editText4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etRoomAnno");
            editText4 = null;
        }
        String string2 = editText4.getText().toString();
        if (this.f26511OooOoO) {
            return;
        }
        this.f26511OooOoO = true;
        p587o0oOooo.o0OO000.OooO00o("101028");
        String strRemovePrefix = StringsKt.removePrefix(str2, (CharSequence) p382o0OOoo0o.o0OoOo0.f44302OooO0OO);
        p377o0OOoOo.o000O00O o000o00o2 = p377o0OOoOo.o000O0O0.f44226OooO00o;
        o00Ooo o00ooo2 = new o00Ooo(this);
        LinkedHashMap linkedHashMapOooO00o = oO00o000.OooO00o();
        linkedHashMapOooO00o.put("barimage", strRemovePrefix);
        linkedHashMapOooO00o.put("barname", oO000Oo0.OooO0O0(string));
        linkedHashMapOooO00o.put("notice", oO000Oo0.OooO0O0(string2));
        linkedHashMapOooO00o.put("type", "1");
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, p377o0OOoOo.o0000O.f44100OooOoo, p377o0OOoOo.o0000O.f44130Oooooo, linkedHashMapOooO00o, o00ooo2);
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p629o0ooO0O0.o00000OO
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        Button button = this.f26506OooOo;
        if (button == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btCreate");
            button = null;
        }
        if (Intrinsics.areEqual(view, button)) {
            OooOo0();
            return;
        }
        NetImageView netImageView = this.f26504OooOOo0;
        if (netImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nivRoomHeader");
            netImageView = null;
        }
        if (Intrinsics.areEqual(view, netImageView)) {
            com.yalla.yalla.util.permission.OooO00o.OooO0OO(this, PermissionGroupReveal.f32883OooO0o, null, new o00Oo0(this));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(oO00OO0O.activity_create_room);
        this.f26512OooOoO0 = (CreateRoomVM) new ViewModelProvider(this).get(CreateRoomVM.class);
        View viewFindViewById = findViewById(oO00O0oO.nivRoomHeader);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.nivRoomHeader)");
        this.f26504OooOOo0 = (NetImageView) viewFindViewById;
        View viewFindViewById2 = findViewById(oO00O0oO.etRoomName);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(R.id.etRoomName)");
        this.f26503OooOOo = (EditText) viewFindViewById2;
        View viewFindViewById3 = findViewById(oO00O0oO.tvRoomNameNum);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(R.id.tvRoomNameNum)");
        this.f26505OooOOoo = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(oO00O0oO.ivRoomNameClear);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(R.id.ivRoomNameClear)");
        this.f26508OooOo00 = (ImageView) viewFindViewById4;
        View viewFindViewById5 = findViewById(oO00O0oO.etRoomAnno);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(R.id.etRoomAnno)");
        this.f26507OooOo0 = (EditText) viewFindViewById5;
        View viewFindViewById6 = findViewById(oO00O0oO.tvRoomAnnoNum);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(R.id.tvRoomAnnoNum)");
        this.f26509OooOo0O = (TextView) viewFindViewById6;
        View viewFindViewById7 = findViewById(oO00O0oO.ivRoomAnnoClear);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(R.id.ivRoomAnnoClear)");
        this.f26510OooOo0o = (ImageView) viewFindViewById7;
        View viewFindViewById8 = findViewById(oO00O0oO.btCreateRoom);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(R.id.btCreateRoom)");
        this.f26506OooOo = (Button) viewFindViewById8;
        OooOOoo(oO00OOo0.Creat_Room);
        NetImageView netImageView = this.f26504OooOOo0;
        EditText editText = null;
        if (netImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nivRoomHeader");
            netImageView = null;
        }
        netImageView.setOnClickListener(this);
        EditText editText2 = this.f26503OooOOo;
        if (editText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etRoomName");
            editText2 = null;
        }
        editText2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.yalla.yalla.ui.activity.room.OooOo
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                int i = CreateRoomActivity.f26502OooOoo0;
                CreateRoomActivity this$0 = this.f26600OooO00o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ImageView imageView = null;
                if (z) {
                    TextView textView = this$0.f26505OooOOoo;
                    if (textView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("tvRoomNameNum");
                        textView = null;
                    }
                    com.code.android.util.o000OO00.OooOOOO(textView);
                    ImageView imageView2 = this$0.f26508OooOo00;
                    if (imageView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("ivRoomNameClear");
                    } else {
                        imageView = imageView2;
                    }
                    com.code.android.util.o000OO00.OooOOOO(imageView);
                    return;
                }
                TextView textView2 = this$0.f26505OooOOoo;
                if (textView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tvRoomNameNum");
                    textView2 = null;
                }
                com.code.android.util.o000OO00.OooO0O0(textView2);
                ImageView imageView3 = this$0.f26508OooOo00;
                if (imageView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("ivRoomNameClear");
                } else {
                    imageView = imageView3;
                }
                com.code.android.util.o000OO00.OooO0O0(imageView);
            }
        });
        EditText editText3 = this.f26507OooOo0;
        if (editText3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etRoomAnno");
            editText3 = null;
        }
        editText3.setImeOptions(6);
        EditText editText4 = this.f26507OooOo0;
        if (editText4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etRoomAnno");
            editText4 = null;
        }
        editText4.setRawInputType(1);
        EditText editText5 = this.f26507OooOo0;
        if (editText5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etRoomAnno");
            editText5 = null;
        }
        editText5.setOnFocusChangeListener(new Oooo000(this, 0));
        EditText editText6 = this.f26503OooOOo;
        if (editText6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etRoomName");
            editText6 = null;
        }
        editText6.setOnEditorActionListener(new Oooo0(this, 0));
        EditText editText7 = this.f26507OooOo0;
        if (editText7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etRoomAnno");
            editText7 = null;
        }
        editText7.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.yalla.yalla.ui.activity.room.o000oOoO
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                int i2 = CreateRoomActivity.f26502OooOoo0;
                CreateRoomActivity this$0 = this.f26855OooO00o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (i != 6) {
                    return false;
                }
                this$0.OooOo0();
                return false;
            }
        });
        new p367o0OOo0o0.OooOO0(this).f43963OooO0o = new oo000o(this);
        ImageView imageView = this.f26508OooOo00;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivRoomNameClear");
            imageView = null;
        }
        imageView.setOnClickListener(new o0OoOo0(this, 0));
        ImageView imageView2 = this.f26510OooOo0o;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivRoomAnnoClear");
            imageView2 = null;
        }
        imageView2.setOnClickListener(new com.google.android.exoplayer2.ui.oo000o(this, 1));
        EditText editText8 = this.f26503OooOOo;
        if (editText8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etRoomName");
            editText8 = null;
        }
        p417o0OoO0.o000Oo0 o000oo1 = new p417o0OoO0.o000Oo0();
        o00oO0o listener = new o00oO0o(this);
        Intrinsics.checkNotNullParameter(listener, "listener");
        o000oo1.f45518OooO0o0 = listener;
        editText8.addTextChangedListener(o000oo1);
        EditText editText9 = this.f26507OooOo0;
        if (editText9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etRoomAnno");
            editText9 = null;
        }
        p417o0OoO0.o000Oo0 o000oo2 = new p417o0OoO0.o000Oo0();
        o0ooOOo listener2 = new o0ooOOo(this);
        Intrinsics.checkNotNullParameter(listener2, "listener");
        o000oo2.f45518OooO0o0 = listener2;
        editText9.addTextChangedListener(o000oo2);
        Button button = this.f26506OooOo;
        if (button == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btCreate");
            button = null;
        }
        button.setOnClickListener(this);
        o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(this);
        p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
        oooO00o.f43911OooO0OO = (String) p464o0Oooo.o000000O.OooO().getValue();
        oooO00o.f43909OooO00o = 0;
        oooO00o.OooO0o0(com.code.android.util.o0000O0.OooO00o(6.0f));
        int i = oOo00OO0.icon_head_default;
        oooO00o.f43913OooO0o = i;
        oooO00o.f43923OooOOOo = i;
        NetImageView netImageView2 = this.f26504OooOOo0;
        if (netImageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nivRoomHeader");
            netImageView2 = null;
        }
        oooO00o.OooO0Oo(netImageView2);
        EditText editText10 = this.f26503OooOOo;
        if (editText10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etRoomName");
            editText10 = null;
        }
        editText10.setText((CharSequence) p464o0Oooo.o000000O.OooOOoo().getValue());
        EditText editText11 = this.f26507OooOo0;
        if (editText11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etRoomAnno");
        } else {
            editText = editText11;
        }
        editText.setText(oO00OOo0.Creat_Room_Anno);
    }
}
