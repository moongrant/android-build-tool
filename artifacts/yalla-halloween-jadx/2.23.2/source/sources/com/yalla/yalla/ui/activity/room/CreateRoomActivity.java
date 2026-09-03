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
import p590o0oOooo0.oOO0OOO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/ui/activity/room/CreateRoomActivity;", "Lcom/yalla/yalla/base/activity/BaseFragmentActivity;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nCreateRoomActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateRoomActivity.kt\ncom/yalla/yalla/ui/activity/room/CreateRoomActivity\n+ 2 TextViewExt.kt\ncom/yalla/yalla/ext/TextViewExtKt\n*L\n1#1,282:1\n160#2,2:283\n160#2,2:285\n*S KotlinDebug\n*F\n+ 1 CreateRoomActivity.kt\ncom/yalla/yalla/ui/activity/room/CreateRoomActivity\n*L\n130#1:283,2\n138#1:285,2\n*E\n"})
public final class CreateRoomActivity extends BaseFragmentActivity {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final /* synthetic */ int f26050OooOoo0 = 0;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public EditText f26051OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public NetImageView f26052OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public TextView f26053OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Button f26054OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public EditText f26055OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public ImageView f26056OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public TextView f26057OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public ImageView f26058OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f26059OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public CreateRoomVM f26060OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @Nullable
    public String f26061OooOoOO;

    public static final class OooO00o {
        public static void OooO00o(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            context.startActivity(new Intent(context, (Class<?>) CreateRoomActivity.class));
        }
    }

    public CreateRoomActivity() {
        p475o0Ooooo0.o0O00oO0 o0o00oo1 = p475o0Ooooo0.o0O00oO0.f47936OooO00o;
        this.f26061OooOoOO = String.valueOf(p475o0Ooooo0.o0O00oO0.OooO().getValue());
    }

    public final void OooOo0() {
        EditText editText = this.f26051OooOOo;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etRoomName");
            editText = null;
        }
        Editable text = editText.getText();
        if (text == null || StringsKt.isBlank(text)) {
            return;
        }
        EditText editText2 = this.f26055OooOo0;
        if (editText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etRoomAnno");
            editText2 = null;
        }
        Editable text2 = editText2.getText();
        if (text2 == null || StringsKt.isBlank(text2)) {
            return;
        }
        String str = this.f26061OooOoOO;
        if (str == null || StringsKt.isBlank(str)) {
            return;
        }
        EditText editText3 = this.f26051OooOOo;
        if (editText3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etRoomName");
            editText3 = null;
        }
        String string = editText3.getText().toString();
        String str2 = this.f26061OooOoOO;
        Intrinsics.checkNotNull(str2);
        EditText editText4 = this.f26055OooOo0;
        if (editText4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etRoomAnno");
            editText4 = null;
        }
        String string2 = editText4.getText().toString();
        if (this.f26059OooOoO) {
            return;
        }
        this.f26059OooOoO = true;
        o0oo0000.OooO00o.OooO0O0("101028");
        String strRemovePrefix = StringsKt.removePrefix(str2, (CharSequence) p386o0OOooO.o0OOO0o.f43501OooO0OO);
        p384o0OOoo0O.o00oO0o o00oo0o2 = p384o0OOoo0O.o0OO00O.f43462OooO00o;
        oo000o oo000oVar = new oo000o(this);
        LinkedHashMap linkedHashMapOooO00o = p426o0OoO0o0.OooOOOO.OooO00o();
        linkedHashMapOooO00o.put("barimage", strRemovePrefix);
        linkedHashMapOooO00o.put("barname", oOO0OOO.OooO0O0(string));
        linkedHashMapOooO00o.put("notice", oOO0OOO.OooO0O0(string2));
        linkedHashMapOooO00o.put("type", "1");
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, p384o0OOoo0O.Oooo0.f43359OooOoo, p384o0OOoo0O.Oooo0.f43389Oooooo, linkedHashMapOooO00o, oo000oVar);
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p400o0Oo0O0.OooOO0O
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        Button button = this.f26054OooOo;
        if (button == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btCreate");
            button = null;
        }
        if (Intrinsics.areEqual(view, button)) {
            OooOo0();
            return;
        }
        NetImageView netImageView = this.f26052OooOOo0;
        if (netImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nivRoomHeader");
            netImageView = null;
        }
        if (Intrinsics.areEqual(view, netImageView)) {
            com.yalla.yalla.util.permission.OooO00o.OooO0OO(this, PermissionGroupReveal.f32339OooO0o, null, new o00Ooo(this));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(p562o0oOo000.oo0o0Oo.activity_create_room);
        this.f26060OooOoO0 = (CreateRoomVM) new ViewModelProvider(this).get(CreateRoomVM.class);
        View viewFindViewById = findViewById(p562o0oOo000.o0OO00O.nivRoomHeader);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f26052OooOOo0 = (NetImageView) viewFindViewById;
        View viewFindViewById2 = findViewById(p562o0oOo000.o0OO00O.etRoomName);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f26051OooOOo = (EditText) viewFindViewById2;
        View viewFindViewById3 = findViewById(p562o0oOo000.o0OO00O.tvRoomNameNum);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f26053OooOOoo = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(p562o0oOo000.o0OO00O.ivRoomNameClear);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f26056OooOo00 = (ImageView) viewFindViewById4;
        View viewFindViewById5 = findViewById(p562o0oOo000.o0OO00O.etRoomAnno);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f26055OooOo0 = (EditText) viewFindViewById5;
        View viewFindViewById6 = findViewById(p562o0oOo000.o0OO00O.tvRoomAnnoNum);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.f26057OooOo0O = (TextView) viewFindViewById6;
        View viewFindViewById7 = findViewById(p562o0oOo000.o0OO00O.ivRoomAnnoClear);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f26058OooOo0o = (ImageView) viewFindViewById7;
        View viewFindViewById8 = findViewById(p562o0oOo000.o0OO00O.btCreateRoom);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.f26054OooOo = (Button) viewFindViewById8;
        OooOOoo(p562o0oOo000.o000000.Creat_Room);
        NetImageView netImageView = this.f26052OooOOo0;
        EditText editText = null;
        if (netImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nivRoomHeader");
            netImageView = null;
        }
        netImageView.setOnClickListener(this);
        EditText editText2 = this.f26051OooOOo;
        if (editText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etRoomName");
            editText2 = null;
        }
        editText2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.yalla.yalla.ui.activity.room.OooOo00
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                int i = CreateRoomActivity.f26050OooOoo0;
                CreateRoomActivity this$0 = this.f26149OooO00o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ImageView imageView = null;
                if (z) {
                    TextView textView = this$0.f26053OooOOoo;
                    if (textView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("tvRoomNameNum");
                        textView = null;
                    }
                    com.code.android.util.o000O.OooOOOO(textView);
                    ImageView imageView2 = this$0.f26056OooOo00;
                    if (imageView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("ivRoomNameClear");
                    } else {
                        imageView = imageView2;
                    }
                    com.code.android.util.o000O.OooOOOO(imageView);
                    return;
                }
                TextView textView2 = this$0.f26053OooOOoo;
                if (textView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tvRoomNameNum");
                    textView2 = null;
                }
                com.code.android.util.o000O.OooO0O0(textView2);
                ImageView imageView3 = this$0.f26056OooOo00;
                if (imageView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("ivRoomNameClear");
                } else {
                    imageView = imageView3;
                }
                com.code.android.util.o000O.OooO0O0(imageView);
            }
        });
        EditText editText3 = this.f26055OooOo0;
        if (editText3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etRoomAnno");
            editText3 = null;
        }
        editText3.setImeOptions(6);
        EditText editText4 = this.f26055OooOo0;
        if (editText4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etRoomAnno");
            editText4 = null;
        }
        editText4.setRawInputType(1);
        EditText editText5 = this.f26055OooOo0;
        if (editText5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etRoomAnno");
            editText5 = null;
        }
        editText5.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.yalla.yalla.ui.activity.room.OooOo
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                int i = CreateRoomActivity.f26050OooOoo0;
                CreateRoomActivity this$0 = this.f26148OooO00o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ImageView imageView = null;
                if (z) {
                    TextView textView = this$0.f26057OooOo0O;
                    if (textView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("tvRoomAnnoNum");
                        textView = null;
                    }
                    com.code.android.util.o000O.OooOOOO(textView);
                    ImageView imageView2 = this$0.f26058OooOo0o;
                    if (imageView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("ivRoomAnnoClear");
                    } else {
                        imageView = imageView2;
                    }
                    com.code.android.util.o000O.OooOOOO(imageView);
                    return;
                }
                TextView textView2 = this$0.f26057OooOo0O;
                if (textView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tvRoomAnnoNum");
                    textView2 = null;
                }
                com.code.android.util.o000O.OooO0O0(textView2);
                ImageView imageView3 = this$0.f26058OooOo0o;
                if (imageView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("ivRoomAnnoClear");
                } else {
                    imageView = imageView3;
                }
                com.code.android.util.o000O.OooO0O0(imageView);
            }
        });
        EditText editText6 = this.f26051OooOOo;
        if (editText6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etRoomName");
            editText6 = null;
        }
        editText6.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.yalla.yalla.ui.activity.room.Oooo000
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                int i2 = CreateRoomActivity.f26050OooOoo0;
                CreateRoomActivity this$0 = this.f26151OooO00o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (i != 5) {
                    return false;
                }
                EditText editText7 = this$0.f26055OooOo0;
                if (editText7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("etRoomAnno");
                    editText7 = null;
                }
                editText7.requestFocus();
                return true;
            }
        });
        EditText editText7 = this.f26055OooOo0;
        if (editText7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etRoomAnno");
            editText7 = null;
        }
        editText7.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.yalla.yalla.ui.activity.room.Oooo0
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                int i2 = CreateRoomActivity.f26050OooOoo0;
                CreateRoomActivity this$0 = this.f26150OooO00o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (i != 6) {
                    return false;
                }
                this$0.OooOo0();
                return false;
            }
        });
        new p371o0OOo0oO.o0OoOo0(this).f43176OooO0o = new o00oO0o(this);
        ImageView imageView = this.f26056OooOo00;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivRoomNameClear");
            imageView = null;
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.yalla.yalla.ui.activity.room.o000oOoO
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = CreateRoomActivity.f26050OooOoo0;
                CreateRoomActivity this$0 = this.f26401OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                EditText editText8 = this$0.f26051OooOOo;
                if (editText8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("etRoomName");
                    editText8 = null;
                }
                editText8.setText((CharSequence) null);
            }
        });
        ImageView imageView2 = this.f26058OooOo0o;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivRoomAnnoClear");
            imageView2 = null;
        }
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.yalla.yalla.ui.activity.room.o0OoOo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = CreateRoomActivity.f26050OooOoo0;
                CreateRoomActivity this$0 = this.f26479OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                EditText editText8 = this$0.f26055OooOo0;
                if (editText8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("etRoomAnno");
                    editText8 = null;
                }
                editText8.setText((CharSequence) null);
            }
        });
        EditText editText8 = this.f26051OooOOo;
        if (editText8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etRoomName");
            editText8 = null;
        }
        p423o0OoO0OO.o00O0OO0 o00o0oo1 = new p423o0OoO0OO.o00O0OO0();
        o0ooOOo listener = new o0ooOOo(this);
        Intrinsics.checkNotNullParameter(listener, "listener");
        o00o0oo1.f46714OooO0o0 = listener;
        editText8.addTextChangedListener(o00o0oo1);
        EditText editText9 = this.f26055OooOo0;
        if (editText9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etRoomAnno");
            editText9 = null;
        }
        p423o0OoO0OO.o00O0OO0 o00o0oo2 = new p423o0OoO0OO.o00O0OO0();
        o0OOO0o listener2 = new o0OOO0o(this);
        Intrinsics.checkNotNullParameter(listener2, "listener");
        o00o0oo2.f46714OooO0o0 = listener2;
        editText9.addTextChangedListener(o00o0oo2);
        Button button = this.f26054OooOo;
        if (button == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btCreate");
            button = null;
        }
        button.setOnClickListener(this);
        o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(this);
        p475o0Ooooo0.o0O00oO0 o0o00oo1 = p475o0Ooooo0.o0O00oO0.f47936OooO00o;
        oooO00o.f43126OooO0OO = (String) p475o0Ooooo0.o0O00oO0.OooO().getValue();
        oooO00o.f43124OooO00o = 0;
        oooO00o.OooO0o0(com.code.android.util.o0000O0.OooO00o(6.0f));
        int i = p562o0oOo000.o0Oo0oo.icon_head_default;
        oooO00o.f43128OooO0o = i;
        oooO00o.f43138OooOOOo = i;
        NetImageView netImageView2 = this.f26052OooOOo0;
        if (netImageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nivRoomHeader");
            netImageView2 = null;
        }
        oooO00o.OooO0Oo(netImageView2);
        EditText editText10 = this.f26051OooOOo;
        if (editText10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etRoomName");
            editText10 = null;
        }
        editText10.setText((CharSequence) p475o0Ooooo0.o0O00oO0.OooOOoo().getValue());
        EditText editText11 = this.f26055OooOo0;
        if (editText11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etRoomAnno");
        } else {
            editText = editText11;
        }
        editText.setText(p562o0oOo000.o000000.Creat_Room_Anno);
    }
}
