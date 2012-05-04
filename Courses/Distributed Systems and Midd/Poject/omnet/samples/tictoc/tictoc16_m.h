//
// Generated file, do not edit! Created by opp_msgc 4.1 from tictoc16.msg.
//

#ifndef _TICTOC16_M_H_
#define _TICTOC16_M_H_

#include <omnetpp.h>

// opp_msgc version check
#define MSGC_VERSION 0x0401
#if (MSGC_VERSION!=OMNETPP_VERSION)
#    error Version mismatch! Probably this file was generated by an earlier version of opp_msgc: 'make clean' should help.
#endif



/**
 * Class generated from <tt>tictoc16.msg</tt> by opp_msgc.
 * <pre>
 * message TicTocMsg16
 * {
 *     int source;
 *     int destination;
 *     int hopCount = 0;
 * }
 * </pre>
 */
class TicTocMsg16 : public ::cMessage
{
  protected:
    int source_var;
    int destination_var;
    int hopCount_var;

    // protected and unimplemented operator==(), to prevent accidental usage
    bool operator==(const TicTocMsg16&);

  public:
    TicTocMsg16(const char *name=NULL, int kind=0);
    TicTocMsg16(const TicTocMsg16& other);
    virtual ~TicTocMsg16();
    TicTocMsg16& operator=(const TicTocMsg16& other);
    virtual TicTocMsg16 *dup() const {return new TicTocMsg16(*this);}
    virtual void parsimPack(cCommBuffer *b);
    virtual void parsimUnpack(cCommBuffer *b);

    // field getter/setter methods
    virtual int getSource() const;
    virtual void setSource(int source_var);
    virtual int getDestination() const;
    virtual void setDestination(int destination_var);
    virtual int getHopCount() const;
    virtual void setHopCount(int hopCount_var);
};

inline void doPacking(cCommBuffer *b, TicTocMsg16& obj) {obj.parsimPack(b);}
inline void doUnpacking(cCommBuffer *b, TicTocMsg16& obj) {obj.parsimUnpack(b);}


#endif // _TICTOC16_M_H_