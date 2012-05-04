//
// Generated file, do not edit! Created by opp_msgc 4.1 from HttpMsg.msg.
//

#ifndef _HTTPMSG_M_H_
#define _HTTPMSG_M_H_

#include <omnetpp.h>

// opp_msgc version check
#define MSGC_VERSION 0x0401
#if (MSGC_VERSION!=OMNETPP_VERSION)
#    error Version mismatch! Probably this file was generated by an earlier version of opp_msgc: 'make clean' should help.
#endif

// cplusplus {{
#include "NetPkt_m.h"
// }}



/**
 * Class generated from <tt>HttpMsg.msg</tt> by opp_msgc.
 * <pre>
 * packet HTTPMsg extends NetPkt
 * {
 *     string payload;
 * };
 * </pre>
 */
class HTTPMsg : public ::NetPkt
{
  protected:
    opp_string payload_var;

    // protected and unimplemented operator==(), to prevent accidental usage
    bool operator==(const HTTPMsg&);

  public:
    HTTPMsg(const char *name=NULL, int kind=0);
    HTTPMsg(const HTTPMsg& other);
    virtual ~HTTPMsg();
    HTTPMsg& operator=(const HTTPMsg& other);
    virtual HTTPMsg *dup() const {return new HTTPMsg(*this);}
    virtual void parsimPack(cCommBuffer *b);
    virtual void parsimUnpack(cCommBuffer *b);

    // field getter/setter methods
    virtual const char * getPayload() const;
    virtual void setPayload(const char * payload_var);
};

inline void doPacking(cCommBuffer *b, HTTPMsg& obj) {obj.parsimPack(b);}
inline void doUnpacking(cCommBuffer *b, HTTPMsg& obj) {obj.parsimUnpack(b);}


#endif // _HTTPMSG_M_H_
