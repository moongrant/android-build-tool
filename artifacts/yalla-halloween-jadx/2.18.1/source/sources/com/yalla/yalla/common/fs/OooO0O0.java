package com.yalla.yalla.common.fs;

import android.content.Context;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 extends OooO00o {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Object[] f20601OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Object f20602OooO0o0;

    public OooO0O0(Context context) {
        super(context);
    }

    public final List OooO00o() {
        List<StorageVolume> listOooO0Oo;
        List<StorageVolume> list = OooO00o.f20598OooO0O0;
        if (list != null) {
            list.clear();
        }
        Method method = null;
        do {
            List<StorageVolume> list2 = OooO00o.f20598OooO0O0;
            if (list2 != null && list2.size() > 0) {
                break;
            }
            Object systemService = this.f20602OooO0o0;
            if (systemService == null) {
                WeakReference<Context> weakReference = OooO00o.f20597OooO00o;
                if (weakReference == null || weakReference.get() == null) {
                    this.f20602OooO0o0 = null;
                    systemService = null;
                } else {
                    systemService = OooO00o.f20597OooO00o.get().getSystemService("storage");
                    this.f20602OooO0o0 = systemService;
                }
            }
            if (systemService != null) {
                try {
                    method = systemService.getClass().getMethod("getVolumeList", new Class[0]);
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                    method = null;
                }
            } else {
                method = null;
            }
            if (method != null) {
                break;
            }
        } while (OooO00o.f20598OooO0O0.size() <= 0);
        if (method != null) {
            try {
                this.f20601OooO0o = (Object[]) method.invoke(this.f20602OooO0o0, new Object[0]);
                listOooO0Oo = OooO0Oo(this.f20601OooO0o);
                if (listOooO0Oo != null && ((ArrayList) listOooO0Oo).size() > 0) {
                    OooO00o.f20598OooO0O0.addAll(listOooO0Oo);
                    return new ArrayList(OooO00o.f20598OooO0O0);
                }
            } catch (IllegalAccessException | NullPointerException | InvocationTargetException e2) {
                e2.printStackTrace();
            }
        } else {
            listOooO0Oo = OooO0Oo(this.f20601OooO0o);
            if (listOooO0Oo != null) {
                OooO00o.f20598OooO0O0.addAll(listOooO0Oo);
                return new ArrayList(OooO00o.f20598OooO0O0);
            }
        }
        return null;
    }

    public final boolean OooO0O0(Object obj, String str) {
        Object objOooO0OO = OooO0OO(obj, str);
        if (objOooO0OO == null) {
            return false;
        }
        try {
            return ((Boolean) objOooO0OO).booleanValue();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public final Object OooO0OO(Object obj, String str) {
        while (true) {
            try {
                return obj.getClass().getMethod(str, new Class[0]).invoke(obj, new Object[0]);
            } catch (Exception e) {
                if (e instanceof NoSuchMethodException) {
                    return null;
                }
                e.printStackTrace();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final List<StorageVolume> OooO0Oo(Object[] objArr) {
        int iIntValue;
        Object objOooO0OO;
        StorageVolume storageVolume;
        String strSubstring;
        Context context;
        Context context2;
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj == null) {
                storageVolume = null;
            } else {
                try {
                    Object objOooO0OO2 = OooO0OO(obj, "getPath");
                    String str = !(objOooO0OO2 instanceof String) ? null : (String) objOooO0OO2;
                    Object objOooO0OO3 = OooO0OO(obj, "getDescription");
                    String string = !(objOooO0OO3 instanceof String) ? null : (String) objOooO0OO3;
                    if (TextUtils.isEmpty(str)) {
                        storageVolume = null;
                    } else {
                        Object objOooO0OO4 = OooO0OO(obj, "getDescriptionId");
                        if (objOooO0OO4 == null) {
                            iIntValue = -1;
                            if (iIntValue != -1 && (context2 = OooO00o.f20597OooO00o.get()) != null) {
                                string = context2.getString(iIntValue);
                            }
                            if (!TextUtils.isEmpty(string) && (string.startsWith("string/") || string.startsWith("string/", 1))) {
                                strSubstring = string.substring(string.lastIndexOf("string/") + 7);
                                context = OooO00o.f20597OooO00o.get();
                                if (context != null && !TextUtils.isEmpty(strSubstring)) {
                                    string = context.getString(context.getResources().getIdentifier(strSubstring, "string", "android"));
                                }
                            }
                            TextUtils.isEmpty(string);
                            OooO0O0(obj, "isRemovable");
                            boolean zOooO0O0 = OooO0O0(obj, "isEmulated");
                            OooO0O0(obj, "allowMassStorage");
                            objOooO0OO = OooO0OO(obj, "getStorageId");
                            if (objOooO0OO != null) {
                                try {
                                    ((Integer) objOooO0OO).intValue();
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                            storageVolume = new StorageVolume(str, zOooO0O0);
                        } else {
                            try {
                                iIntValue = ((Integer) Integer.class.cast(objOooO0OO4)).intValue();
                            } catch (Exception e2) {
                                e2.printStackTrace();
                                iIntValue = -1;
                            }
                            if (iIntValue != -1) {
                                string = context2.getString(iIntValue);
                            }
                            if (!TextUtils.isEmpty(string)) {
                                strSubstring = string.substring(string.lastIndexOf("string/") + 7);
                                context = OooO00o.f20597OooO00o.get();
                                if (context != null) {
                                    string = context.getString(context.getResources().getIdentifier(strSubstring, "string", "android"));
                                }
                            }
                            TextUtils.isEmpty(string);
                            OooO0O0(obj, "isRemovable");
                            boolean zOooO0O1 = OooO0O0(obj, "isEmulated");
                            OooO0O0(obj, "allowMassStorage");
                            objOooO0OO = OooO0OO(obj, "getStorageId");
                            if (objOooO0OO != null) {
                                ((Integer) objOooO0OO).intValue();
                            }
                            storageVolume = new StorageVolume(str, zOooO0O1);
                        }
                    }
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }
            if (storageVolume != null) {
                arrayList.add(storageVolume);
            }
        }
        if (arrayList.size() > 0) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(arrayList);
            arrayList.clear();
            arrayList.addAll(linkedHashSet);
        }
        return arrayList;
    }
}
