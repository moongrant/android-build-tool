package p016OooOoOO;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.LayoutRes;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.OooOO0O;
import androidx.appcompat.widget.o000000;
import androidx.appcompat.widget.o000Oo0;
import androidx.core.view.o0ooOOo;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParserException;
import p004OooO0oO.o0OoOo0;
import p012OooOo0O.o00O0O;
import p018OooOoo0.OooOOOO;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class o00oO0o extends MenuInflater {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final Class<?>[] f299OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Class<?>[] f300OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object[] f301OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object[] f302OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Context f303OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Object f304OooO0Oo;

    public static class OooO00o implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final Class<?>[] f305OooO0OO = {MenuItem.class};

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Object f306OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Method f307OooO0O0;

        public OooO00o(Object obj, String str) {
            this.f306OooO00o = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f307OooO0O0 = cls.getMethod(str, f305OooO0OO);
            } catch (Exception e) {
                StringBuilder sbOooO0O0 = o0OoOo0.OooO0O0("Couldn't resolve menu item onClick handler ", str, " in class ");
                sbOooO0O0.append(cls.getName());
                InflateException inflateException = new InflateException(sbOooO0O0.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            Method method = this.f307OooO0O0;
            try {
                Class<?> returnType = method.getReturnType();
                Class<?> cls = Boolean.TYPE;
                Object obj = this.f306OooO00o;
                if (returnType == cls) {
                    return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
                }
                method.invoke(obj, menuItem);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public class OooO0O0 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f308OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Menu f309OooO00o;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public boolean f316OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public int f317OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public CharSequence f318OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public CharSequence f319OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public char f320OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public int f321OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public int f322OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public char f323OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public int f324OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public int f325OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public boolean f326OooOOoo;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public String f327OooOo;

        /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
        public boolean f328OooOo0;

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        public boolean f329OooOo00;

        /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
        public int f330OooOo0O;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f331OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public androidx.core.view.OooO0O0 f332OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public String f333OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public CharSequence f334OooOoOO;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public CharSequence f336OooOoo0;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public ColorStateList f335OooOoo = null;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public PorterDuff.Mode f337OooOooO = null;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f310OooO0O0 = 0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f311OooO0OO = 0;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f312OooO0Oo = 0;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f314OooO0o0 = 0;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f313OooO0o = true;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public boolean f315OooO0oO = true;

        public OooO0O0(Menu menu) {
            this.f309OooO00o = menu;
        }

        public final <T> T OooO00o(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, o00oO0o.this.f303OooO0OO.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
                return null;
            }
        }

        public final void OooO0O0(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.f326OooOOoo).setVisible(this.f329OooOo00).setEnabled(this.f328OooOo0).setCheckable(this.f324OooOOo >= 1).setTitleCondensed(this.f319OooOO0o).setIcon(this.f321OooOOO0);
            int i = this.f330OooOo0O;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            String str = this.f333OooOoO0;
            o00oO0o o00oo0o2 = o00oO0o.this;
            if (str != null) {
                if (o00oo0o2.f303OooO0OO.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                if (o00oo0o2.f304OooO0Oo == null) {
                    o00oo0o2.f304OooO0Oo = o00oO0o.OooO00o(o00oo0o2.f303OooO0OO);
                }
                menuItem.setOnMenuItemClickListener(new OooO00o(o00oo0o2.f304OooO0Oo, this.f333OooOoO0));
            }
            if (this.f324OooOOo >= 2) {
                if (menuItem instanceof OooOO0O) {
                    ((OooOO0O) menuItem).OooO0o(true);
                } else if (menuItem instanceof OooOOOO) {
                    OooOOOO oooOOOO = (OooOOOO) menuItem;
                    try {
                        Method method = oooOOOO.f377OooO0o0;
                        o0000.OooO0O0 oooO0O0 = oooOOOO.f376OooO0Oo;
                        if (method == null) {
                            oooOOOO.f377OooO0o0 = oooO0O0.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        }
                        oooOOOO.f377OooO0o0.invoke(oooO0O0, Boolean.TRUE);
                    } catch (Exception e) {
                        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
                    }
                }
            }
            String str2 = this.f327OooOo;
            if (str2 != null) {
                menuItem.setActionView((View) OooO00o(str2, o00oO0o.f300OooO0o0, o00oo0o2.f301OooO00o));
                z = true;
            }
            int i2 = this.f331OooOo0o;
            if (i2 > 0) {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i2);
                }
            }
            androidx.core.view.OooO0O0 oooO0O1 = this.f332OooOoO;
            if (oooO0O1 != null) {
                if (menuItem instanceof o0000.OooO0O0) {
                    ((o0000.OooO0O0) menuItem).OooO0O0(oooO0O1);
                } else {
                    Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
                }
            }
            CharSequence charSequence = this.f334OooOoOO;
            boolean z2 = menuItem instanceof o0000.OooO0O0;
            if (z2) {
                ((o0000.OooO0O0) menuItem).setContentDescription(charSequence);
            } else if (Build.VERSION.SDK_INT >= 26) {
                o0ooOOo.OooO0oo(menuItem, charSequence);
            }
            CharSequence charSequence2 = this.f336OooOoo0;
            if (z2) {
                ((o0000.OooO0O0) menuItem).setTooltipText(charSequence2);
            } else if (Build.VERSION.SDK_INT >= 26) {
                o0ooOOo.OooOOO0(menuItem, charSequence2);
            }
            char c = this.f320OooOOO;
            int i3 = this.f322OooOOOO;
            if (z2) {
                ((o0000.OooO0O0) menuItem).setAlphabeticShortcut(c, i3);
            } else if (Build.VERSION.SDK_INT >= 26) {
                o0ooOOo.OooO0oO(menuItem, c, i3);
            }
            char c2 = this.f323OooOOOo;
            int i4 = this.f325OooOOo0;
            if (z2) {
                ((o0000.OooO0O0) menuItem).setNumericShortcut(c2, i4);
            } else if (Build.VERSION.SDK_INT >= 26) {
                o0ooOOo.OooOO0O(menuItem, c2, i4);
            }
            PorterDuff.Mode mode = this.f337OooOooO;
            if (mode != null) {
                if (z2) {
                    ((o0000.OooO0O0) menuItem).setIconTintMode(mode);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    o0ooOOo.OooOO0(menuItem, mode);
                }
            }
            ColorStateList colorStateList = this.f335OooOoo;
            if (colorStateList != null) {
                if (z2) {
                    ((o0000.OooO0O0) menuItem).setIconTintList(colorStateList);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    o0ooOOo.OooO(menuItem, colorStateList);
                }
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f300OooO0o0 = clsArr;
        f299OooO0o = clsArr;
    }

    public o00oO0o(Context context) {
        super(context);
        this.f303OooO0OO = context;
        Object[] objArr = {context};
        this.f301OooO00o = objArr;
        this.f302OooO0O0 = objArr;
    }

    public static Object OooO00o(Context context) {
        return (!(context instanceof Activity) && (context instanceof ContextWrapper)) ? OooO00o(((ContextWrapper) context).getBaseContext()) : context;
    }

    /* JADX WARN: Code duplicated, block: B:82:0x0241  */
    public final void OooO0O0(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i;
        OooO0O0 oooO0O0 = new OooO0O0(menu);
        int eventType = xmlResourceParser.getEventType();
        do {
            i = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlResourceParser.next();
                break;
            }
            eventType = xmlResourceParser.next();
        } while (eventType != 1);
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            Menu menu2 = oooO0O0.f309OooO00o;
            if (eventType != i) {
                if (eventType == 3) {
                    String name2 = xmlResourceParser.getName();
                    if (z2 && name2.equals(str)) {
                        z2 = false;
                        str = null;
                    } else if (name2.equals("group")) {
                        oooO0O0.f310OooO0O0 = 0;
                        oooO0O0.f311OooO0OO = 0;
                        oooO0O0.f312OooO0Oo = 0;
                        oooO0O0.f314OooO0o0 = 0;
                        oooO0O0.f313OooO0o = true;
                        oooO0O0.f315OooO0oO = true;
                    } else if (name2.equals("item")) {
                        if (!oooO0O0.f316OooO0oo) {
                            androidx.core.view.OooO0O0 oooO0O1 = oooO0O0.f332OooOoO;
                            if (oooO0O1 == null || !oooO0O1.OooO00o()) {
                                oooO0O0.f316OooO0oo = true;
                                oooO0O0.OooO0O0(menu2.add(oooO0O0.f310OooO0O0, oooO0O0.f308OooO, oooO0O0.f317OooOO0, oooO0O0.f318OooOO0O));
                            } else {
                                oooO0O0.f316OooO0oo = true;
                                oooO0O0.OooO0O0(menu2.addSubMenu(oooO0O0.f310OooO0O0, oooO0O0.f308OooO, oooO0O0.f317OooOO0, oooO0O0.f318OooOO0O).getItem());
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z = true;
                    }
                }
            } else if (!z2) {
                String name3 = xmlResourceParser.getName();
                boolean zEquals = name3.equals("group");
                o00oO0o o00oo0o2 = o00oO0o.this;
                if (zEquals) {
                    TypedArray typedArrayObtainStyledAttributes = o00oo0o2.f303OooO0OO.obtainStyledAttributes(attributeSet, o00O0O.MenuGroup);
                    oooO0O0.f310OooO0O0 = typedArrayObtainStyledAttributes.getResourceId(o00O0O.MenuGroup_android_id, 0);
                    oooO0O0.f311OooO0OO = typedArrayObtainStyledAttributes.getInt(o00O0O.MenuGroup_android_menuCategory, 0);
                    oooO0O0.f312OooO0Oo = typedArrayObtainStyledAttributes.getInt(o00O0O.MenuGroup_android_orderInCategory, 0);
                    oooO0O0.f314OooO0o0 = typedArrayObtainStyledAttributes.getInt(o00O0O.MenuGroup_android_checkableBehavior, 0);
                    oooO0O0.f313OooO0o = typedArrayObtainStyledAttributes.getBoolean(o00O0O.MenuGroup_android_visible, true);
                    oooO0O0.f315OooO0oO = typedArrayObtainStyledAttributes.getBoolean(o00O0O.MenuGroup_android_enabled, true);
                    typedArrayObtainStyledAttributes.recycle();
                } else if (name3.equals("item")) {
                    Context context = o00oo0o2.f303OooO0OO;
                    o000Oo0 o000oo1 = new o000Oo0(context, context.obtainStyledAttributes(attributeSet, o00O0O.MenuItem));
                    oooO0O0.f308OooO = o000oo1.OooO(o00O0O.MenuItem_android_id, 0);
                    oooO0O0.f317OooOO0 = (o000oo1.OooO0oo(o00O0O.MenuItem_android_menuCategory, oooO0O0.f311OooO0OO) & (-65536)) | (o000oo1.OooO0oo(o00O0O.MenuItem_android_orderInCategory, oooO0O0.f312OooO0Oo) & 65535);
                    oooO0O0.f318OooOO0O = o000oo1.OooOO0O(o00O0O.MenuItem_android_title);
                    oooO0O0.f319OooOO0o = o000oo1.OooOO0O(o00O0O.MenuItem_android_titleCondensed);
                    oooO0O0.f321OooOOO0 = o000oo1.OooO(o00O0O.MenuItem_android_icon, 0);
                    String strOooOO0 = o000oo1.OooOO0(o00O0O.MenuItem_android_alphabeticShortcut);
                    oooO0O0.f320OooOOO = strOooOO0 == null ? (char) 0 : strOooOO0.charAt(0);
                    oooO0O0.f322OooOOOO = o000oo1.OooO0oo(o00O0O.MenuItem_alphabeticModifiers, 4096);
                    String strOooOO1 = o000oo1.OooOO0(o00O0O.MenuItem_android_numericShortcut);
                    oooO0O0.f323OooOOOo = strOooOO1 == null ? (char) 0 : strOooOO1.charAt(0);
                    oooO0O0.f325OooOOo0 = o000oo1.OooO0oo(o00O0O.MenuItem_numericModifiers, 4096);
                    int i2 = o00O0O.MenuItem_android_checkable;
                    if (o000oo1.OooOO0o(i2)) {
                        oooO0O0.f324OooOOo = o000oo1.OooO00o(i2, false) ? 1 : 0;
                    } else {
                        oooO0O0.f324OooOOo = oooO0O0.f314OooO0o0;
                    }
                    oooO0O0.f326OooOOoo = o000oo1.OooO00o(o00O0O.MenuItem_android_checked, false);
                    oooO0O0.f329OooOo00 = o000oo1.OooO00o(o00O0O.MenuItem_android_visible, oooO0O0.f313OooO0o);
                    oooO0O0.f328OooOo0 = o000oo1.OooO00o(o00O0O.MenuItem_android_enabled, oooO0O0.f315OooO0oO);
                    oooO0O0.f330OooOo0O = o000oo1.OooO0oo(o00O0O.MenuItem_showAsAction, -1);
                    oooO0O0.f333OooOoO0 = o000oo1.OooOO0(o00O0O.MenuItem_android_onClick);
                    oooO0O0.f331OooOo0o = o000oo1.OooO(o00O0O.MenuItem_actionLayout, 0);
                    oooO0O0.f327OooOo = o000oo1.OooOO0(o00O0O.MenuItem_actionViewClass);
                    String strOooOO2 = o000oo1.OooOO0(o00O0O.MenuItem_actionProviderClass);
                    boolean z3 = strOooOO2 != null;
                    if (z3 && oooO0O0.f331OooOo0o == 0 && oooO0O0.f327OooOo == null) {
                        oooO0O0.f332OooOoO = (androidx.core.view.OooO0O0) oooO0O0.OooO00o(strOooOO2, f299OooO0o, o00oo0o2.f302OooO0O0);
                    } else {
                        if (z3) {
                            Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                        }
                        oooO0O0.f332OooOoO = null;
                    }
                    oooO0O0.f334OooOoOO = o000oo1.OooOO0O(o00O0O.MenuItem_contentDescription);
                    oooO0O0.f336OooOoo0 = o000oo1.OooOO0O(o00O0O.MenuItem_tooltipText);
                    int i3 = o00O0O.MenuItem_iconTintMode;
                    if (o000oo1.OooOO0o(i3)) {
                        oooO0O0.f337OooOooO = o000000.OooO0OO(o000oo1.OooO0oo(i3, -1), oooO0O0.f337OooOooO);
                    } else {
                        oooO0O0.f337OooOooO = null;
                    }
                    int i4 = o00O0O.MenuItem_iconTint;
                    if (o000oo1.OooOO0o(i4)) {
                        oooO0O0.f335OooOoo = o000oo1.OooO0O0(i4);
                    } else {
                        oooO0O0.f335OooOoo = null;
                    }
                    o000oo1.OooOOO();
                    oooO0O0.f316OooO0oo = false;
                } else if (name3.equals("menu")) {
                    oooO0O0.f316OooO0oo = true;
                    SubMenu subMenuAddSubMenu = menu2.addSubMenu(oooO0O0.f310OooO0O0, oooO0O0.f308OooO, oooO0O0.f317OooOO0, oooO0O0.f318OooOO0O);
                    oooO0O0.OooO0O0(subMenuAddSubMenu.getItem());
                    OooO0O0(xmlResourceParser, attributeSet, subMenuAddSubMenu);
                } else {
                    str = name3;
                    z2 = true;
                }
            }
            eventType = xmlResourceParser.next();
            i = 2;
            z = z;
            z2 = z2;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(@LayoutRes int i, Menu menu) {
        if (!(menu instanceof o0000.OooO00o)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.f303OooO0OO.getResources().getLayout(i);
                    OooO0O0(layout, Xml.asAttributeSet(layout), menu);
                    layout.close();
                } catch (XmlPullParserException e) {
                    throw new InflateException("Error inflating menu XML", e);
                }
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } catch (Throwable th) {
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
