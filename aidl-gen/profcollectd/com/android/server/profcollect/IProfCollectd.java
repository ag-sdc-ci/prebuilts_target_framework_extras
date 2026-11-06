/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/system/extras/profcollectd/binder -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/system/extras/aidl-gen/profcollectd /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/system/extras/profcollectd/binder/com/android/server/profcollect/IProfCollectd.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package com.android.server.profcollect;
/** {@hide} */
public interface IProfCollectd extends android.os.IInterface
{
  /** Default implementation for IProfCollectd. */
  public static class Default implements com.android.server.profcollect.IProfCollectd
  {
    @Override public void schedule() throws android.os.RemoteException
    {
    }
    @Override public void terminate() throws android.os.RemoteException
    {
    }
    @Override public void trace_once(java.lang.String tag) throws android.os.RemoteException
    {
    }
    @Override public void process() throws android.os.RemoteException
    {
    }
    /** -1 if there is no usageSetting */
    @Override public java.lang.String report(int usageSetting) throws android.os.RemoteException
    {
      return null;
    }
    @Override public java.lang.String get_supported_provider() throws android.os.RemoteException
    {
      return null;
    }
    @Override public void registerProviderStatusCallback(com.android.server.profcollect.IProviderStatusCallback cb) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.android.server.profcollect.IProfCollectd
  {
    /** Construct the stub and attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.android.server.profcollect.IProfCollectd interface,
     * generating a proxy if needed.
     */
    public static com.android.server.profcollect.IProfCollectd asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.android.server.profcollect.IProfCollectd))) {
        return ((com.android.server.profcollect.IProfCollectd)iin);
      }
      return new com.android.server.profcollect.IProfCollectd.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      if (code >= android.os.IBinder.FIRST_CALL_TRANSACTION && code <= android.os.IBinder.LAST_CALL_TRANSACTION) {
        data.enforceInterface(DESCRIPTOR);
      }
      switch (code)
      {
        case TRANSACTION_schedule:
        {
          this.schedule();
          reply.writeNoException();
          break;
        }
        case TRANSACTION_terminate:
        {
          this.terminate();
          reply.writeNoException();
          break;
        }
        case TRANSACTION_trace_once:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          this.trace_once(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_process:
        {
          this.process();
          reply.writeNoException();
          break;
        }
        case TRANSACTION_report:
        {
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _result = this.report(_arg0);
          reply.writeNoException();
          reply.writeString(_result);
          break;
        }
        case TRANSACTION_get_supported_provider:
        {
          java.lang.String _result = this.get_supported_provider();
          reply.writeNoException();
          reply.writeString(_result);
          break;
        }
        case TRANSACTION_registerProviderStatusCallback:
        {
          com.android.server.profcollect.IProviderStatusCallback _arg0;
          _arg0 = com.android.server.profcollect.IProviderStatusCallback.Stub.asInterface(data.readStrongBinder());
          this.registerProviderStatusCallback(_arg0);
          reply.writeNoException();
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static final class Proxy implements com.android.server.profcollect.IProfCollectd
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public final java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      @Override public void schedule() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_schedule, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void terminate() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_terminate, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void trace_once(java.lang.String tag) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(tag);
          boolean _status = mRemote.transact(Stub.TRANSACTION_trace_once, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void process() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_process, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /** -1 if there is no usageSetting */
      @Override public java.lang.String report(int usageSetting) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(usageSetting);
          boolean _status = mRemote.transact(Stub.TRANSACTION_report, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readString();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public java.lang.String get_supported_provider() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_get_supported_provider, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readString();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void registerProviderStatusCallback(com.android.server.profcollect.IProviderStatusCallback cb) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongInterface(cb);
          boolean _status = mRemote.transact(Stub.TRANSACTION_registerProviderStatusCallback, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
    }
    static final int TRANSACTION_schedule = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_terminate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_trace_once = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_process = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_report = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_get_supported_provider = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_registerProviderStatusCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "com.android.server.profcollect.IProfCollectd";
  public void schedule() throws android.os.RemoteException;
  public void terminate() throws android.os.RemoteException;
  public void trace_once(java.lang.String tag) throws android.os.RemoteException;
  public void process() throws android.os.RemoteException;
  /** -1 if there is no usageSetting */
  public java.lang.String report(int usageSetting) throws android.os.RemoteException;
  public java.lang.String get_supported_provider() throws android.os.RemoteException;
  public void registerProviderStatusCallback(com.android.server.profcollect.IProviderStatusCallback cb) throws android.os.RemoteException;
}
