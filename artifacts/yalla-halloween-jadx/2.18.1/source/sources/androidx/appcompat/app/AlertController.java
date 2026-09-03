package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class AlertController {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f4363OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Oooo000 f4364OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Window f4365OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f4366OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public RecycleListView f4367OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public CharSequence f4368OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public View f4369OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f4370OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public Button f4371OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public CharSequence f4372OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public Message f4373OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public Button f4374OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public Drawable f4375OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public CharSequence f4376OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public Message f4377OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public Button f4378OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public Drawable f4379OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public CharSequence f4380OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Drawable f4381OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public Drawable f4382OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public Message f4383OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public NestedScrollView f4384OooOo0O;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public TextView f4386OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public ImageView f4387OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public TextView f4388OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public ListAdapter f4389OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public View f4390OooOoo0;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public int f4392OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public int f4393Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public int f4394Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public int f4395Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public int f4396Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public int f4397Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public boolean f4398Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public OooO0OO f4400Oooo0o0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f4362OooO = false;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f4385OooOo0o = 0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f4391OooOooO = -1;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final OooO00o f4399Oooo0o = new OooO00o();

    public class OooO00o implements View.OnClickListener {
        public OooO00o() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Message messageObtain;
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            if (view == alertController.f4371OooOO0 && (message3 = alertController.f4373OooOO0o) != null) {
                messageObtain = Message.obtain(message3);
            } else if (view != alertController.f4374OooOOO || (message2 = alertController.f4377OooOOOo) == null) {
                messageObtain = (view != alertController.f4378OooOOo || (message = alertController.f4383OooOo00) == null) ? null : Message.obtain(message);
            } else {
                messageObtain = Message.obtain(message2);
            }
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.f4400Oooo0o0.obtainMessage(1, alertController2.f4364OooO0O0).sendToTarget();
        }
    }

    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public View f4402OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Context f4403OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final LayoutInflater f4404OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Drawable f4405OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public CharSequence f4406OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public DialogInterface.OnKeyListener f4407OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public View f4408OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public ListAdapter f4409OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public DialogInterface.OnClickListener f4410OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public boolean f4411OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public int f4412OooOO0O = -1;

        public OooO0O0(Context context) {
            this.f4403OooO00o = context;
            this.f4404OooO0O0 = (LayoutInflater) context.getSystemService("layout_inflater");
        }
    }

    public static final class OooO0OO extends Handler {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public WeakReference<DialogInterface> f4413OooO00o;

        public OooO0OO(DialogInterface dialogInterface) {
            this.f4413OooO00o = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f4413OooO00o.get(), message.what);
            } else {
                if (i != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    public static class OooO0o extends ArrayAdapter<CharSequence> {
        public OooO0o(Context context, int i) {
            super(context, i, R.id.text1, (Object[]) null);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final boolean hasStableIds() {
            return true;
        }
    }

    public static class RecycleListView extends ListView {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final int f4414Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final int f4415Oooo0oO;

        public RecycleListView(Context context) {
            this(context, null);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OooOo00.OooOOOO.RecycleListView);
            this.f4415Oooo0oO = typedArrayObtainStyledAttributes.getDimensionPixelOffset(OooOo00.OooOOOO.RecycleListView_paddingBottomNoButtons, -1);
            this.f4414Oooo0o = typedArrayObtainStyledAttributes.getDimensionPixelOffset(OooOo00.OooOOOO.RecycleListView_paddingTopNoTitle, -1);
        }
    }

    public AlertController(Context context, Oooo000 oooo000, Window window) {
        this.f4363OooO00o = context;
        this.f4364OooO0O0 = oooo000;
        this.f4365OooO0OO = window;
        this.f4400Oooo0o0 = new OooO0OO(oooo000);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, OooOo00.OooOOOO.AlertDialog, OooOo00.OooO00o.alertDialogStyle, 0);
        this.f4392OooOooo = typedArrayObtainStyledAttributes.getResourceId(OooOo00.OooOOOO.AlertDialog_android_layout, 0);
        this.f4394Oooo000 = typedArrayObtainStyledAttributes.getResourceId(OooOo00.OooOOOO.AlertDialog_buttonPanelSideLayout, 0);
        this.f4395Oooo00O = typedArrayObtainStyledAttributes.getResourceId(OooOo00.OooOOOO.AlertDialog_listLayout, 0);
        this.f4396Oooo00o = typedArrayObtainStyledAttributes.getResourceId(OooOo00.OooOOOO.AlertDialog_multiChoiceItemLayout, 0);
        this.f4393Oooo0 = typedArrayObtainStyledAttributes.getResourceId(OooOo00.OooOOOO.AlertDialog_singleChoiceItemLayout, 0);
        this.f4397Oooo0O0 = typedArrayObtainStyledAttributes.getResourceId(OooOo00.OooOOOO.AlertDialog_listItemLayout, 0);
        this.f4398Oooo0OO = typedArrayObtainStyledAttributes.getBoolean(OooOo00.OooOOOO.AlertDialog_showTitle, true);
        this.f4366OooO0Oo = typedArrayObtainStyledAttributes.getDimensionPixelSize(OooOo00.OooOOOO.AlertDialog_buttonIconDimen, 0);
        typedArrayObtainStyledAttributes.recycle();
        oooo000.OooO();
    }

    public static boolean OooO00o(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (OooO00o(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static void OooO0OO(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    public final void OooO0O0(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    @Nullable
    public final ViewGroup OooO0Oo(@Nullable View view, @Nullable View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }
}
